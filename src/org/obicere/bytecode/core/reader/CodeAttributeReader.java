package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Attribute;
import org.obicere.bytecode.core.objects.CodeAttribute;
import org.obicere.bytecode.core.objects.CodeException;
import org.obicere.bytecode.core.objects.instruction.Instruction;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Obicere
 */
public class CodeAttributeReader implements Reader<CodeAttribute> {

    private final AttributeReader attributeReader;
    private final InstructionReader instructionReader = new InstructionReader();

    public CodeAttributeReader(final AttributeReader attributeReader) {
        this.attributeReader = attributeReader;
    }

    @Override
    public CodeAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int maxStack = input.readUnsignedShort();
        final int maxLocals = input.readUnsignedShort();
        final int codeLength = input.readInt();

        final int codeOffset = input.getLogicalIndex();

        final byte[] code = new byte[codeLength];
        if (input.read(code) < 0) {
            throw new ClassFormatError("reached end of file while reading instructions.");
        }

        final IndexedDataInputStream codeReader = new IndexedDataInputStream(codeOffset, code);

        // set the default size to the code length. Every instruction takes
        // at least 1 byte, meaning there is at a maximum of _codeLength_
        // instructions to be read
        final ArrayList<Instruction> instructionList = new ArrayList<>(codeLength);

        while (codeReader.available() > 0) { // While there are remaining instructions
            instructionList.add(instructionReader.read(codeReader));
        }
        final Instruction[] instructions = instructionList.toArray(new Instruction[instructionList.size()]);

        final int exceptionTableLength = input.readUnsignedShort();
        final CodeException[] exceptionTable = new CodeException[exceptionTableLength];

        for (int i = 0; i < exceptionTableLength; i++) {
            final int startIndex = input.getLogicalIndex();
            final int startPC = input.readUnsignedShort();
            final int endPC = input.readUnsignedShort();
            final int handlerPC = input.readUnsignedShort();
            final int catchType = input.readUnsignedShort();
            final CodeException exception = new CodeException(startPC, endPC, handlerPC, catchType);
            final int endIndex = input.getLogicalIndex();

            exception.setBounds(startIndex, endIndex);
            exceptionTable[i] = exception;
        }
        final int attributesCount = input.readUnsignedShort();
        final Attribute[] attributes = new Attribute[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
            attributes[i] = attributeReader.read(input);
        }
        return new CodeAttribute(length, maxStack, maxLocals, code, instructions, exceptionTable, attributes);
    }
}
