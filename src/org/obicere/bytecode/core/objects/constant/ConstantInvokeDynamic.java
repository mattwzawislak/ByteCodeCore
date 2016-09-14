package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.attribute.BootstrapMethodsAttribute;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamic extends Constant {

    private final int bootstrapMethodAttrIndex;

    private final int nameAndTypeIndex;

    private volatile BootstrapMethod method;

    private volatile MethodReference actualMethod;

    public ConstantInvokeDynamic(final ConstantPool constantPool, final int bootstrapMethodAttrIndex, final int nameAndTypeIndex) {
        super(constantPool, ConstantReader.CONSTANT_INVOKE_DYNAMIC);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public BootstrapMethod getBootstrapMethod() {
        if (method == null) {
            final Class outer = constantPool.getDeclaringClass();
            final BootstrapMethodsAttribute attribute = outer.getAttributeSet().getAttribute(BootstrapMethodsAttribute.class);
            this.method = attribute.getBootstrapMethods()[bootstrapMethodAttrIndex];
        }

        return method;
    }

    public MethodReference getActualMethod() {
        if (actualMethod == null) {
            final Class outer = constantPool.getDeclaringClass();
            final ConstantNameAndType nameAndType = constantPool.get(nameAndTypeIndex);

            this.actualMethod = new MethodReference(outer.getName(), nameAndType.getName(), nameAndType.getType());
        }

        return actualMethod;
    }

    @Override
    public String toString() {
        return constantPool.getAsString(nameAndTypeIndex) + " " + bootstrapMethodAttrIndex;
    }
}
