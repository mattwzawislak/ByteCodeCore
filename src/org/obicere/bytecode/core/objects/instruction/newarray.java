package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class newarray extends Instruction {

    public static final  String IDENTIFIER = "newarray";
    private static final int    OPCODE     = 0xbc;

    private final int    atype;
    private final String type;

    public newarray(final int atype) {
        super(IDENTIFIER, OPCODE);
        this.atype = atype;
        this.type = getTypeOfAType();
    }

    public int getAtype() {
        return atype;
    }

    public String getType() {
        return type;
    }

    private String getTypeOfAType() {
        // 6.5.newarray Table 6.1
        switch (atype) {
            case 4:
                return "boolean";
            case 5:
                return "char";
            case 6:
                return "float";
            case 7:
                return "double";
            case 8:
                return "byte";
            case 9:
                return "short";
            case 10:
                return "int";
            case 11:
                return "long";
            default:
                throw new IllegalArgumentException("illegal aType value.");
        }
    }
}
