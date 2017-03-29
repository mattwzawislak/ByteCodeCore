package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.CharacterElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultCharacterElementValue extends AbstractElementValue implements CharacterElementValue {

    private final char value;

    public DefaultCharacterElementValue(final char value) {
        super(ElementValues.TAG_CHARACTER);
        this.value = value;
    }

    @Override
    public char getValue() {
        return value;
    }
}