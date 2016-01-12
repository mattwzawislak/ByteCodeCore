package org.obicere.bytecode.core.objects;

/**
 */
public abstract class MethodRef extends Constant {

    private final int classIndex;
    private final int nameAndTypeIndex;

    public MethodRef(final int tag, final int classIndex, final int nameAndTypeIndex) {
        super(tag);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(classIndex) + ";" + constantPool.getAsString(nameAndTypeIndex);
    }
}
