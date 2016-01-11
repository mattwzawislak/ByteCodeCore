package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ClassElementValue extends ElementValue {

    public static final String IDENTIFIER = "ClassElementValue";

    private static final int TAG = 'B';

    private final int classInfoIndex;

    public ClassElementValue(final int classInfoIndex) {
        super(TAG);
        this.classInfoIndex = classInfoIndex;
    }

    public int getClassInfoIndex() {
        return classInfoIndex;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
