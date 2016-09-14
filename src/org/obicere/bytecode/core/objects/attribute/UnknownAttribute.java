package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class UnknownAttribute extends Attribute {

    public static final String IDENTIFIER = "UnknownAttribute";

    private final String name;
    private final byte[] bytes;

    public UnknownAttribute(final String name, final byte[] bytes) {
        this.name = name;
        this.bytes = bytes;
    }

    public String getName() {
        return name;
    }

    public byte[] getBytes() {
        return bytes;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
