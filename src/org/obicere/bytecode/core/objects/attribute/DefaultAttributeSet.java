package org.obicere.bytecode.core.objects.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.AttributeSet;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 */
public class DefaultAttributeSet implements AttributeSet {

    public static final AttributeSet EMPTY_SET = new EmptyAttributeSet();

    private ByteCodeReader reader;

    private Attribute[] attributes;

    private int size;

    public DefaultAttributeSet(final ByteCodeReader reader, final byte[] attributes) {
        this.reader = new ByteCodeReader(reader, attributes);
    }

    private DefaultAttributeSet() {
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

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public <T extends Attribute> Set<T> getAttributes(final Class<T> cls) {
        if (attributes == null) {
            initialize();
        }
        final Set<T> result = new HashSet<>();
        for (final Attribute attribute : attributes) {
            if (matches(attribute, cls)) {
                final T typedAttribute = cls.cast(attribute);
                result.add(typedAttribute);
            }
        }
        return result;
    }

    @Override
    public <T extends Attribute> T getAttribute(final Class<T> cls) {
        if (attributes == null) {
            initialize();
        }
        for (final Attribute attribute : attributes) {
            if (matches(attribute, cls)) {
                return cls.cast(attribute);
            }
        }
        return null;
    }

    @Override
    public void removeAttributes(final Class<? extends Attribute> cls) {
        for (int i = 0; i < attributes.length; i++) {
            final Attribute attribute = attributes[i];
            if (matches(attribute, cls)) {
                attributes[i] = null;
                size--;
            }
        }
    }

    @Override
    public void removeAttribute(final Class<? extends Attribute> cls) {
        for (int i = 0; i < attributes.length; i++) {
            final Attribute attribute = attributes[i];
            if (matches(attribute, cls)) {
                attributes[i] = null;
                size--;

                break;
            }
        }
    }

    private boolean matches(final Attribute attribute, final Class<?> cls) {
        return attribute != null && cls.isInstance(attribute);
    }

    private static class EmptyAttributeSet extends DefaultAttributeSet {

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public <T extends Attribute> Set<T> getAttributes(final Class<T> cls) {
            return Collections.emptySet();
        }

        @Override
        public <T extends Attribute> T getAttribute(final Class<T> cls) {
            return null;
        }

        @Override
        public void removeAttributes(final Class<? extends Attribute> cls) {
        }

        @Override
        public void removeAttribute(final Class<? extends Attribute> cls) {
        }
    }
}
