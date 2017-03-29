package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.DoubleElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultDoubleElementValue extends AbstractElementValue implements DoubleElementValue {

    private final double value;

    public DefaultDoubleElementValue(final double value) {
        super(ElementValues.TAG_DOUBLE);
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
