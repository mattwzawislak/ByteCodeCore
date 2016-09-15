package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.CodeAttribute;
import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.objects.code.table.CodeException;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CodeAttributeReader implements Reader<CodeAttribute> {

    private final InstructionReader instructionReader;

    public CodeAttributeReader(final InstructionReader instructionReader) {
        this.instructionReader = instructionReader;
    }

    @Override
    public CodeAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int maxStack = input.readUnsignedShort();
        final int maxLocals = input.readUnsignedShort();
        final int codeLength = input.readInt();

        final byte[] code = new byte[codeLength];
        if (input.read(code) < 0) {
            throw new ClassFormatError("reached end of file while reading instructions.");
        }

        final int exceptionTableLength = input.readUnsignedShort();
        final CodeException[] exceptionTable = new CodeException[exceptionTableLength];

        for (int i = 0; i < exceptionTableLength; i++) {
            final LazyLabel start = input.readLazyLabel();
            final LazyLabel end = input.readLazyLabel();
            final LazyLabel handler = input.readLazyLabel();

            final ConstantClass catchTypeConstant = input.readConstant();
            final String catchTypeName = catchTypeConstant.getName();
            final Type catchType = Type.of(catchTypeName);

            exceptionTable[i] = new CodeException(start, end, handler, catchType);
        }
        final AttributeSet attributeSet = input.readAttributeSet();
        return new CodeAttribute(maxStack, maxLocals, code, exceptionTable, attributeSet, instructionReader);
    }
}
