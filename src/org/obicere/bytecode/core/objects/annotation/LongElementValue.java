package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class LongElementValue extends ElementValue {

    public static final String IDENTIFIER = "LongElementValue";

    private final long value;

    public LongElementValue(final long value) {
        super(ElementValueReader.TAG_LONG);
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
