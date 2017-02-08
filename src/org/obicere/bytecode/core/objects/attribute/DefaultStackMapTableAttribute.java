package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.StackMapTableAttribute;
import org.javacore.code.frame.StackMapFrame;

/**
 * @author Obicere
 */
public class DefaultStackMapTableAttribute extends AbstractAttribute implements StackMapTableAttribute {

    private final StackMapFrame[] entries;

    public DefaultStackMapTableAttribute(final StackMapFrame[] entries) {
        super("StackMapTableAttribute");
        if (entries == null) {
            throw new NullPointerException("entries must be non-null");
        }

        this.entries = entries;
    }

    @Override
    public int getNumberOfEntries() {
        return entries.length;
    }

    public StackMapFrame[] getEntries() {
        return entries;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
