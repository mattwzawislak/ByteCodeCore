package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.BooleanElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultBooleanElementValue extends AbstractElementValue implements BooleanElementValue {

    private final boolean value;

    public DefaultBooleanElementValue(final boolean value) {
        super(ElementValueReader.TAG_BOOLEAN);
        this.value = value;
    }

    @Override
    public boolean getValue() {
        return value;
    }
}
