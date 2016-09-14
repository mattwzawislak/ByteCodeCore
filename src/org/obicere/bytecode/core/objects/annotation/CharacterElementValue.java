package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class CharacterElementValue extends ElementValue {

    public static final String IDENTIFIER = "CharacterElementValue";

    private final char value;

    public CharacterElementValue(final char value) {
        super(ElementValueReader.TAG_CHARACTER);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}