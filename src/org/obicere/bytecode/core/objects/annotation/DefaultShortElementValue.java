package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ShortElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultShortElementValue extends AbstractElementValue implements ShortElementValue {

    private final short value;

    public DefaultShortElementValue(final short value) {
        super(ElementValueReader.TAG_SHORT);
        this.value = value;
    }

    @Override
    public short getValue() {
        return value;
    }
}
