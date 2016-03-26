package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class sipush extends Instruction {

    public static final String IDENTIFIER = "sipush";

    private final int byte1;
    private final int byte2;

    public sipush(final int byte1, final int byte2) {
        this.byte1 = byte1;
        this.byte2 = byte2;
    }

    public int getByte1(){
        return byte1;
    }

    public int getByte2(){
        return byte2;
    }

    public int getValue(){
        return (byte1 << 8) | byte2;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_SIPUSH;
    }
}
