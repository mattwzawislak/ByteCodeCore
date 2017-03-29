package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.LongElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultLongElementValue extends AbstractElementValue implements LongElementValue {

    private final long value;

    public DefaultLongElementValue(final long value) {
        super(ElementValues.TAG_LONG);
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
