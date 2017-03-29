package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.ConstantValueAttribute;
import org.javacore.constant.Constant;

/**
 * @author Obicere
 */
public class DefaultConstantValueAttribute extends AbstractAttribute implements ConstantValueAttribute {

    private final Constant value;

    public DefaultConstantValueAttribute(final Constant value) {
        super(Attributes.CONSTANT_VALUE_ATTRIBUTE_NAME);
        this.value = value;
    }

    @Override
    public Constant getConstantValue() {
        return value;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
