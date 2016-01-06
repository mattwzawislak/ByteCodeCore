package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class Annotation extends ByteCodeElement {

    public static final String IDENTIFIER = "Annotation";

    private final int typeIndex;

    private final ElementValuePair[] elementValuePairs;

    public Annotation(final int typeIndex, final ElementValuePair[] elementValuePairs) {
        if(elementValuePairs == null){
            throw new NullPointerException("element value pairs must be non-null");
        }
        this.typeIndex = typeIndex;
        this.elementValuePairs = elementValuePairs;
    }

    public int getTypeIndex() {
        return typeIndex;
    }

    public ElementValuePair[] getElementValuePairs() {
        return elementValuePairs;
    }

    public String getIdentifier() {
        return IDENTIFIER;
    }

}
