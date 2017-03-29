package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Instructions;
import org.javacore.code.instruction.Wide;
import org.obicere.bytecode.core.objects.code.instruction.DefaultWide;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class WideReader implements Reader<Wide> {

    @Override
    public Wide read(final ByteCodeReader input) throws IOException {
        final byte opcode = input.readByte();
        if (!isValidWideTag(opcode)) {
            throw new ClassFormatError("invalid operation after a wide instruction listing: " + opcode);
        }
        if (opcode == Instructions.OPCODE_IINC) { // need to read two extra bytes
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
            case Instructions.OPCODE_IINC:
            case Instructions.OPCODE_ILOAD:
            case Instructions.OPCODE_FLOAD:
            case Instructions.OPCODE_LLOAD:
            case Instructions.OPCODE_DLOAD:
            case Instructions.OPCODE_ISTORE:
            case Instructions.OPCODE_ASTORE:
            case Instructions.OPCODE_LSTORE:
            case Instructions.OPCODE_DSTORE:
            case Instructions.OPCODE_RET:
                return true;
            default:
                return false;
        }
    }
}