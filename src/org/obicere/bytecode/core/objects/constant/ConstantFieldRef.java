package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantFieldRef extends ConstantRef<Field> {

    private final int classIndex;

    private final int nameAndTypeIndex;

    private volatile FieldReference ref;

    public ConstantFieldRef(final ConstantPool constantPool1, final int classIndex, final int nameAndTypeIndex) {
        super(constantPool1, ConstantReader.CONSTANT_FIELD_REF);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public FieldReference getReference() {
        if (ref == null) {
            final ConstantClass containing = constantPool.get(classIndex);
            final ConstantNameAndType nameAndType = constantPool.get(nameAndTypeIndex);

            final String cls = containing.getName();
            final String name = nameAndType.getName();
            final String type = nameAndType.getType();

            ref = new FieldReference(cls, name, type);
        }

        return ref;
    }

    @Override
    public String toString() {
        return constantPool.getAsString(classIndex) + ";" + constantPool.getAsString(nameAndTypeIndex);
    }
}
