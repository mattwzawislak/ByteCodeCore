package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.DeprecatedAttribute;

/**
 * @author Obicere
 */
public class DefaultDeprecatedAttribute extends AbstractAttribute implements DeprecatedAttribute {

    private static final DeprecatedAttribute INSTANCE = new DefaultDeprecatedAttribute();

    private DefaultDeprecatedAttribute() {
        super(Attributes.DEPRECATED_ATTRIBUTE_NAME);
    }

    public static DeprecatedAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
