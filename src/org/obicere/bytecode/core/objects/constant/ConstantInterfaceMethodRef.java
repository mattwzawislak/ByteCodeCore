package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantInterfaceMethodRef extends ConstantRef<Method> {

    private final int classIndex;

    private final int nameAndTypeIndex;

    private volatile MethodReference ref;

    public ConstantInterfaceMethodRef(final ConstantPool constantPool, final int classIndex, final int nameAndTypeIndex) {
        super(constantPool, ConstantReader.CONSTANT_INTERFACE_METHOD_REF);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public MethodReference getReference() {
        if (ref == null) {
            final ConstantClass containing = constantPool.get(classIndex);
            final ConstantNameAndType nameAndType = constantPool.get(nameAndTypeIndex);

            final String cls = containing.getName();
            final String name = nameAndType.getName();
            final String type = nameAndType.getType();

            ref = new MethodReference(cls, name, type);
        }

        return ref;
    }

    @Override
    public String toString() {
        return constantPool.getAsString(classIndex) + ";" + constantPool.getAsString(nameAndTypeIndex);
    }
}
