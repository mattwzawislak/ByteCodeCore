package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class StringElementValue extends ElementValue {

    public static final String IDENTIFIER = "StringElementValue";

    private final String value;

    public StringElementValue(final String value) {
        super(ElementValueReader.TAG_STRING);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
