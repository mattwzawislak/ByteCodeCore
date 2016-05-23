package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class Field implements Identifiable {

    public static final String IDENTIFIER = "Field";

    private final int accessFlags;

    private final int nameIndex;

    private final int descriptorIndex;

    private final AttributeSet attributeSet;

    public Field(final int accessFlags, final int nameIndex, final int descriptorIndex, final Attribute[] attributes) {
        if (attributes == null) {
            throw new NullPointerException("attributes must be non-null");
        }
        this.accessFlags = accessFlags;
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
        this.attributeSet = new AttributeSet(attributes);
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
