package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class Annotation implements Identifiable {

    public static final String IDENTIFIER = "Annotation";

    private final Type type;

    private final ElementValuePair[] elementValuePairs;

    public Annotation(final Type type, final ElementValuePair[] elementValuePairs) {
        if(type == null) {
            throw new NullPointerException("type must be non-null");
        }
        if (elementValuePairs == null) {
            throw new NullPointerException("element value pairs must be non-null");
        }
        this.type = type;
        this.elementValuePairs = elementValuePairs;
    }

    public Type getType() {
        return type;
    }

    public ElementValuePair[] getElementValuePairs() {
        return elementValuePairs;
    }

    public String getIdentifier() {
        return IDENTIFIER;
    }

}
