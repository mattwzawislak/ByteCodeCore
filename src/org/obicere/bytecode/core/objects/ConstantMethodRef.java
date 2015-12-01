package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantMethodRef extends AbstractConstantMethodRef {

    private static final String NAME = "MethodRef";

    public ConstantMethodRef(final int classIndex, final int nameAndTypeIndex) {
        super(ConstantReader.CONSTANT_METHOD_REF, classIndex, nameAndTypeIndex);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
