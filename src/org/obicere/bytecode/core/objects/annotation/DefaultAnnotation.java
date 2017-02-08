package org.obicere.bytecode.core.objects.annotation;

import org.javacore.JCClass;
import org.javacore.annotation.Annotation;
import org.javacore.annotation.ElementValuePair;

/**
 * @author Obicere
 */
public class DefaultAnnotation implements Annotation {

    private final JCClass type;

    private final ElementValuePair[] elementValuePairs;

    public DefaultAnnotation(final JCClass type, final ElementValuePair[] elementValuePairs) {
        if (type == null) {
            throw new NullPointerException("type must be non-null");
        }
        if (elementValuePairs == null) {
            throw new NullPointerException("element value pairs must be non-null");
        }
        this.type = type;
        this.elementValuePairs = elementValuePairs;
    }

    @Override
    public JCClass getType() {
        return type;
    }

    @Override
    public ElementValuePair[] getValues() {
        return elementValuePairs;
    }
}
