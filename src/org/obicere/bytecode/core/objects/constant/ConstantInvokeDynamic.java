package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamic extends Constant {

    private final int bootstrapMethodAttrIndex;

    private final int nameAndTypeIndex;

    private volatile String name;

    private volatile String type;

    public ConstantInvokeDynamic(final ConstantPool constantPool, final int bootstrapMethodAttrIndex, final int nameAndTypeIndex) {
        super(constantPool, ConstantReader.CONSTANT_INVOKE_DYNAMIC);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getBootstrapMethodIndex() {
        return bootstrapMethodAttrIndex;
    }

    public String getMethodName() {
        if(name == null) {
            final ConstantNameAndType nameAndType = constantPool.get(nameAndTypeIndex);
            name = nameAndType.getName();
        }
        return name;
    }

    public String getMethodType() {
        if(type == null) {
            final ConstantNameAndType nameAndType = constantPool.get(nameAndTypeIndex);
            type = nameAndType.getType();
        }
        return type;
    }

    @Override
    public String toString() {
        return constantPool.getAsString(nameAndTypeIndex) + " " + bootstrapMethodAttrIndex;
    }
}
