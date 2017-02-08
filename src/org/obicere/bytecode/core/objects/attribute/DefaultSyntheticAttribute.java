package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.SyntheticAttribute;

/**
 * @author Obicere
 */
public class DefaultSyntheticAttribute extends AbstractAttribute implements SyntheticAttribute {

    private static final SyntheticAttribute INSTANCE = new DefaultSyntheticAttribute();

    private DefaultSyntheticAttribute() {
        super("SyntheticAttribute");
    }

    public static SyntheticAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
