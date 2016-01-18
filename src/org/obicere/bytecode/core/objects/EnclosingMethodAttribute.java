package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class EnclosingMethodAttribute extends Attribute {

    public static final String IDENTIFIER = "EnclosingMethodAttribute";

    private final int classIndex;
    private final int methodIndex;

    public EnclosingMethodAttribute(final int length, final int classIndex, final int methodIndex) {
        super(length);
        this.classIndex = classIndex;
        this.methodIndex = methodIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getMethodIndex() {
        return methodIndex;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
