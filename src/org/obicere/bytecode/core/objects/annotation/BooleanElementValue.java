package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class BooleanElementValue extends ElementValue {

    public static final String IDENTIFIER = "BooleanElementValue";

    private final boolean value;

    public BooleanElementValue(final boolean value) {
        super(ElementValueReader.TAG_BOOLEAN);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
