package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class return_ extends Instruction {

    public static final String IDENTIFIER = "return";
    private static final int    OPCODE   = 0xb1;

    public return_() {
        super(IDENTIFIER, OPCODE);
    }
}
