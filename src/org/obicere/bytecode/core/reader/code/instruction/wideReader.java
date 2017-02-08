package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultWide;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class wideReader implements Reader<DefaultWide> {

    @Override
    public DefaultWide read(final ByteCodeReader input) throws IOException {
        final byte opcode = input.readByte();
        if (!isValidWideTag(opcode)) {
            throw new ClassFormatError("invalid operation after a wide instruction listing: " + opcode);
        }
        if (opcode == InstructionReader.OPCODE_IINC) { // need to read two extra bytes
            final int index = input.readUnsignedShort();
            final int constant = input.readShort();
            return new DefaultWide(opcode, index, constant);
        } else {
            final int index = input.readUnsignedShort();
            return new DefaultWide(opcode, index);
        }
    }

    private boolean isValidWideTag(final int opcode) {
        switch (opcode) {
            case InstructionReader.OPCODE_IINC:
            case InstructionReader.OPCODE_ILOAD:
            case InstructionReader.OPCODE_FLOAD:
            case InstructionReader.OPCODE_LLOAD:
            case InstructionReader.OPCODE_DLOAD:
            case InstructionReader.OPCODE_ISTORE:
            case InstructionReader.OPCODE_ASTORE:
            case InstructionReader.OPCODE_LSTORE:
            case InstructionReader.OPCODE_DSTORE:
            case InstructionReader.OPCODE_RET:
                return true;
            default:
                return false;
        }
    }
}