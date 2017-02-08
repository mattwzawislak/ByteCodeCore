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
            this.attributes = newAttributes;
        } catch (final IOException e) {
            e.printStackTrace();
            this.attributes = new Attribute[0];
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Attribute> Set<T> getAttributes(final Class<T> cls) {
        if (attributes == null) {
            initialize();
        }
        final Set<T> result = new HashSet<>();
        for (final Attribute attribute : attributes) {
            if (cls.isInstance(attribute)) {
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
            if (cls.isInstance(attribute)) {
                return (T) attribute;
            }
        }
        return null;
    }

    public Attribute[] getAttributes() {
        if (attributes == null) {
            initialize();
        }
        return attributes;
    }
}
