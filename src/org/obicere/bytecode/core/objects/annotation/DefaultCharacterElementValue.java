package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.CharacterElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultCharacterElementValue extends AbstractElementValue implements CharacterElementValue {

    private final char value;

    public DefaultCharacterElementValue(final char value) {
        super(ElementValueReader.TAG_CHARACTER);
        this.value = value;
    }

    @Override
    public char getValue() {
        return value;
    }
}