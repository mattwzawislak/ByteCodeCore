package org.obicere.bytecode.core.objects.constant;

import org.javacore.common.BootstrapMethodLink;
import org.javacore.constant.ConstantInvokeDynamic;
import org.javacore.constant.ConstantNameAndType;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantInvokeDynamic extends AbstractConstant implements ConstantInvokeDynamic {

    private final int bootstrapMethodAttrIndex;

    private final int nameAndTypeIndex;

    private volatile String name;

    private volatile String type;

    public DefaultConstantInvokeDynamic(final ConstantPool constantPool, final int bootstrapMethodAttrIndex, final int nameAndTypeIndex) {
        super(constantPool, ConstantReader.CONSTANT_INVOKE_DYNAMIC);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getBootstrapMethodIndex() {
        return bootstrapMethodAttrIndex;
    }

    public String getMethodName() {
        if(name == null) {
            final ConstantNameAndType nameAndType = (ConstantNameAndType) constantPool.get(nameAndTypeIndex);
            name = nameAndType.getName();
        }
        return name;
    }

    public String getMethodType() {
        if(type == null) {
            final ConstantNameAndType nameAndType = (ConstantNameAndType)constantPool.get(nameAndTypeIndex);
            type = nameAndType.getType();
        }
        return type;
    }

    @Override
    public BootstrapMethodLink getInvocation() {
        return null;
    }
}
