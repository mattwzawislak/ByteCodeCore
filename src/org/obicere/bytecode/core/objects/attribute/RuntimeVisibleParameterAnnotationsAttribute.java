package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.annotation.Annotation;

/**
 * @author Obicere
 */
public class RuntimeVisibleParameterAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeVisibleParameterAnnotationsAttribute";

    private final Annotation[][] parameterAnnotations;

    public RuntimeVisibleParameterAnnotationsAttribute(final Annotation[][] parameterAnnotations) {
        if (parameterAnnotations == null) {
            throw new NullPointerException("parameter annotations must be non-null");
        }

        for (final Annotation[] annotations : parameterAnnotations) {
            if (annotations == null) {
                throw new NullPointerException("annotations must be non-null");
            }
        }
        this.parameterAnnotations = parameterAnnotations;
    }

    public Annotation[][] getParameterAnnotations() {
        return parameterAnnotations;
    }

    public Annotation[] getAnnotations(final int parameter) {
        return parameterAnnotations[parameter];
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
