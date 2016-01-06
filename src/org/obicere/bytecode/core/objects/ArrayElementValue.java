package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ArrayElementValue extends ElementValue {

    public static final String IDENTIFIER = "ArrayElementValue";

    private static final int TAG = '[';

    private final ElementValue[] values;

    public ArrayElementValue(final ElementValue[] values) {
        super(TAG);

        if (values == null) {
            throw new NullPointerException("values must be non-null");
        }

        this.values = values;
    }

    public ElementValue[] getValues() {
        return values;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
