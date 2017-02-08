package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.DoubleElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultDoubleElementValue extends AbstractElementValue implements DoubleElementValue {

    private final double value;

    public DefaultDoubleElementValue(final double value) {
        super(ElementValueReader.TAG_DOUBLE);
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
