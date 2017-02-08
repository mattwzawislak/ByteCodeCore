package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantNameAndType;
import org.javacore.constant.ConstantPool;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantNameAndType extends AbstractConstant implements ConstantNameAndType {

    private final int nameIndex;

    private final int typeIndex;

    public DefaultConstantNameAndType(final ConstantPool constantPool, final int nameIndex, final int typeIndex) {
        super(constantPool, ConstantReader.CONSTANT_NAME_AND_TYPE);
        this.nameIndex = nameIndex;
        this.typeIndex = typeIndex;
    }

    @Override
    public String getName() {
        final ConstantUtf8 utf8 = (ConstantUtf8) constantPool.get(nameIndex);
        return utf8.getValue();
    }

    @Override
    public String getType() {
        final ConstantUtf8 utf8 = (ConstantUtf8) constantPool.get(typeIndex);
        return utf8.getValue();
    }
}
