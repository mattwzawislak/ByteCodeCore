package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantMethodRef;
import org.javacore.constant.ConstantNameAndType;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantMethodRef extends AbstractConstant implements ConstantMethodRef {

    private final int classIndex;

    private final int nameAndTypeIndex;

    private volatile MethodReference ref;

    public DefaultConstantMethodRef(final ConstantPool constantPool, final int classIndex, final int nameAndTypeIndex) {
        super(constantPool, Constants.CONSTANT_INTERFACE_METHOD_REF);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public MethodReference getReference() {
        if (ref == null) {
            final ConstantClass containing = (ConstantClass) constantPool.get(classIndex);
            final ConstantNameAndType nameAndType = (ConstantNameAndType) constantPool.get(nameAndTypeIndex);

            final String cls = containing.getName();
            final String name = nameAndType.getName();
            final String type = nameAndType.getType();

            ref = new MethodReference(cls, name, type);
        }

        return ref;
    }
}
