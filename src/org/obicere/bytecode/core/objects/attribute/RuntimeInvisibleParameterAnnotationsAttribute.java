package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.annotation.Annotation;

/**
 * @author Obicere
 */
public class RuntimeInvisibleParameterAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeInvisibleParameterAnnotationsAttribute";

    private final Annotation[][] parameterAnnotations;

    public RuntimeInvisibleParameterAnnotationsAttribute(final Annotation[][] parameterAnnotations) {
        if (parameterAnnotations == null) {
            throw new NullPointerException("parameter must be non-null");
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
