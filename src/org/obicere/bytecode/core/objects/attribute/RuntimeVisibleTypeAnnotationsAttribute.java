package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.annotation.TypeAnnotation;

/**
 * @author Obicere
 */
public class RuntimeVisibleTypeAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeVisibleTypeAnnotationsAttribute";

    private final TypeAnnotation[] annotations;

    public RuntimeVisibleTypeAnnotationsAttribute(final TypeAnnotation[] annotations) {
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }

        this.annotations = annotations;
    }

    public TypeAnnotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
