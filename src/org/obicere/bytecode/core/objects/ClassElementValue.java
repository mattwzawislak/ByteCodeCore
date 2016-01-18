package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class ClassElementValue extends ElementValue {

    public static final String IDENTIFIER = "ClassElementValue";

    private final int classInfoIndex;

    public ClassElementValue(final int classInfoIndex) {
        super(ElementValueReader.TAG_CLASS);
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
