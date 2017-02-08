package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.UnknownAttribute;

/**
 * @author Obicere
 */
public class DefaultUnknownAttribute extends AbstractAttribute implements UnknownAttribute {

    private final byte[] bytes;

    public DefaultUnknownAttribute(final String name, final byte[] bytes) {
        super(name);
        this.bytes = bytes;
    }

    @Override
    public byte[] getInformation() {
        return bytes;
    }

    @Override
    public int getAttributeLength() {
        return bytes.length;
    }
}
