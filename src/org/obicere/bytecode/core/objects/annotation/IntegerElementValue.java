package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class IntegerElementValue extends ElementValue {

    public static final String IDENTIFIER = "IntegerElementValue";

    private final int value;

    public IntegerElementValue(final int value) {
        super(ElementValueReader.TAG_INTEGER);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
