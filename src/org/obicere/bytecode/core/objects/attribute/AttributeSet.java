package org.obicere.bytecode.core.objects.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.Attribute;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 */
public class AttributeSet {

    public static final AttributeSet EMPTY_SET = new AttributeSet();

    private ByteCodeReader reader;

    private Attribute[] attributes;

    private int size;

    public AttributeSet(final ByteCodeReader reader, final byte[] attributes) {
        this.reader = new ByteCodeReader(reader, attributes);
    }

    private AttributeSet() {
        this.attributes = new Attribute[0];
    }

    private void initialize() {
        // assert that attributes == null
        try {
            final int number = reader.readUnsignedShort();
            final Attribute[] newAttributes = new Attribute[number];
            for (int i = 0; i < number; i++) {
                newAttributes[i] = reader.read(Identifier.ATTRIBUTE);
            }
            this.size = number;
            this.attributes = newAttributes;
        } catch (final IOException e) {
            e.printStackTrace();
            this.attributes = new Attribute[0];
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public <T extends Attribute> Set<T> getAttributes(final Class<T> cls) {
        if (attributes == null) {
            initialize();
        }
        final Set<T> result = new HashSet<>();
        for (final Attribute attribute : attributes) {
            if (attribute != null && cls.isInstance(attribute)) {
                result.add((T) attribute);
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T extends Attribute> T getAttribute(final Class<T> cls) {
        if (attributes == null) {
            initialize();
        }
        for (final Attribute attribute : attributes) {
            if (attribute != null && cls.isInstance(attribute)) {
                return (T) attribute;
            }
        }
        return null;
    }

    public void removeAttributes(final Class<? extends Attribute> cls) {
        for (int i = 0; i < attributes.length; i++) {
            final Attribute attribute = attributes[i];
            if (attribute != null && cls.isInstance(attribute)) {
                attributes[i] = null;
                size--;
            }
        }
    }
}
