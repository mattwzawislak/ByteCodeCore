package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class EnclosingMethodAttribute extends Attribute {

    private final int classIndex;
    private final int methodIndex;

    public EnclosingMethodAttribute(final int classIndex, final int methodIndex) {
        this.classIndex = classIndex;
        this.methodIndex = methodIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getMethodIndex() {
        return methodIndex;
    }

}
