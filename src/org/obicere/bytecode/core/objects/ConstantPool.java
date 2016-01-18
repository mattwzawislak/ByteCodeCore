package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ConstantPool extends ByteCodeElement {

    public static final String IDENTIFIER = "ConstantPool";

    public static final String NULL_ENTRY = "<null entry>";

    private final Constant[] constants;

    public ConstantPool(final Constant[] constants) {
        if (constants == null) {
            throw new NullPointerException("constants must be non-null");
        }
        this.constants = constants;
    }

    public Constant get(final int index) {
        if (index >= constants.length) {
            return null;
        }
        return constants[index];
    }

    public String getAsString(final int index) {
        final Constant constant = get(index);
        if (constant == null) {
            return NULL_ENTRY;
        }
        return constant.toString(this);
    }

    public Constant[] getConstants() {
        return constants;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
