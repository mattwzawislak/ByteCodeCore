package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.DeprecatedAttribute;

/**
 * @author Obicere
 */
public class DefaultDeprecatedAttribute extends AbstractAttribute implements DeprecatedAttribute {

    private static final DeprecatedAttribute INSTANCE = new DefaultDeprecatedAttribute();

    private DefaultDeprecatedAttribute() {
        super("DeprecatedAttribute");
    }

    public static DeprecatedAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
