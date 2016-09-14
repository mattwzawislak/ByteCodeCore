package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.annotation.Annotation;

/**
 * @author Obicere
 */
public class RuntimeVisibleAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeVisibleAnnotationsAttribute";

    private final Annotation[] annotations;

    public RuntimeVisibleAnnotationsAttribute(final Annotation[] annotations) {
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }
        this.annotations = annotations;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
