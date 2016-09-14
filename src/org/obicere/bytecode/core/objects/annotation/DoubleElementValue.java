package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DoubleElementValue extends ElementValue {

    public static final String IDENTIFIER = "DoubleElementValue";

    private final double value;

    public DoubleElementValue(final double value) {
        super(ElementValueReader.TAG_DOUBLE);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
