package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class ArrayElementValue extends ElementValue {

    public static final String IDENTIFIER = "ArrayElementValue";

    private final ElementValue[] values;

    public ArrayElementValue(final ElementValue[] values) {
        super(ElementValueReader.TAG_ARRAY);
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
