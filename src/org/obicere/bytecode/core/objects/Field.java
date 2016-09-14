package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.Attribute;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;

/**
 * @author Obicere
 */
public final class Field implements Identifiable {

    public static final String IDENTIFIER = "Field";

    private final int accessFlags;

    private final String name;

    private final String typeName;

    private final AttributeSet attributeSet;

    public Field(final int accessFlags, final String name, final String type, final Attribute[] attributes) {
        if (attributes == null) {
            throw new NullPointerException("attributes must be non-null");
        }
        this.accessFlags = accessFlags;
        this.name = name;
        this.typeName = type;
        this.attributeSet = new AttributeSet(attributes);
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        return typeName;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
