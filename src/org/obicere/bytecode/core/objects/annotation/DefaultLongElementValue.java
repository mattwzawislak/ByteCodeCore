package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.LongElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultLongElementValue extends AbstractElementValue implements LongElementValue {

    private final long value;

    public DefaultLongElementValue(final long value) {
        super(ElementValueReader.TAG_LONG);
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
