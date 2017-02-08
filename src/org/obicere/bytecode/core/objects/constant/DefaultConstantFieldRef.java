package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantFieldRef;
import org.javacore.constant.ConstantNameAndType;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantFieldRef extends AbstractConstant implements ConstantFieldRef {

    private final int classIndex;

    private final int nameAndTypeIndex;

    private volatile FieldReference ref;

    public DefaultConstantFieldRef(final ConstantPool constantPool1, final int classIndex, final int nameAndTypeIndex) {
        super(constantPool1, ConstantReader.CONSTANT_FIELD_REF);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public FieldReference getReference() {
        if (ref == null) {
            final ConstantClass containing = (ConstantClass) constantPool.get(classIndex);
            final ConstantNameAndType nameAndType = (ConstantNameAndType) constantPool.get(nameAndTypeIndex);

            final String cls = containing.getName();
            final String name = nameAndType.getName();
            final String type = nameAndType.getType();

            ref = new FieldReference(cls, name, type);
        }

        return ref;
    }
}
