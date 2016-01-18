package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ElementValuePair extends ByteCodeElement {

    public static final String IDENTIFIER = "ElementValuePair";

    private final int elementNameIndex;

    private final ElementValue value;

    public ElementValuePair(final int elementNameIndex, final ElementValue value) {
        if (value == null) {
            throw new NullPointerException("value must be non-null");
        }
        this.elementNameIndex = elementNameIndex;
        this.value = value;
    }

    public int getElementNameIndex() {
        return elementNameIndex;
    }

    public ElementValue getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
