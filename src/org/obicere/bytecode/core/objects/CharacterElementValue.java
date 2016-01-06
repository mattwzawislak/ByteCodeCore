package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class CharacterElementValue extends ElementValue {

    public static final String IDENTIFIER = "CharacterElementValue";

    private static final int TAG = 'C';

    private final int constantValueIndex;

    public CharacterElementValue(final int constantValueIndex) {
        super(TAG);
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