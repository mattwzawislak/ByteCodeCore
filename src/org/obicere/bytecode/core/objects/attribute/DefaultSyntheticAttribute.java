package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.SyntheticAttribute;

/**
 * @author Obicere
 */
public class DefaultSyntheticAttribute extends AbstractAttribute implements SyntheticAttribute {

    private static final SyntheticAttribute INSTANCE = new DefaultSyntheticAttribute();

    private DefaultSyntheticAttribute() {
        super(Attributes.SYNTHETIC_ATTRIBUTE_NAME);
    }

    public static SyntheticAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
