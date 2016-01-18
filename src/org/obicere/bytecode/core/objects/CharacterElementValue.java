package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class CharacterElementValue extends ElementValue {

    public static final String IDENTIFIER = "CharacterElementValue";

    private final int constantValueIndex;

    public CharacterElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_CHARACTER);
        this.constantValueIndex = constantValueIndex;
    }

    public int getConstantValueIndex() {
        return constantValueIndex;
    }
    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}