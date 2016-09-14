package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.Attribute;
import org.obicere.bytecode.core.objects.attribute.CodeAttribute;
import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.objects.code.table.CodeException;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CodeAttributeReader implements Reader<CodeAttribute> {

    private final AttributeReader attributeReader;

    private final InstructionReader instructionReader;

    public CodeAttributeReader(final AttributeReader attributeReader, final InstructionReader instructionReader) {
        this.attributeReader = attributeReader;
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
            final int catchType = input.readUnsignedShort();

            exceptionTable[i] = new CodeException(start, end, handler, catchType);
        }
        final int attributesCount = input.readUnsignedShort();
        final Attribute[] attributes = new Attribute[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
            attributes[i] = attributeReader.read(input);
        }
        return new CodeAttribute(maxStack, maxLocals, code.length, code, exceptionTable, attributes, instructionReader);
    }
}
