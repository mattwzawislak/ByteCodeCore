package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.Annotation;
import org.javacore.attribute.RuntimeVisibleParameterAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeVisibleParameterAnnotationsAttribute extends AbstractAttribute implements RuntimeVisibleParameterAnnotationsAttribute {

    private final Annotation[][] parameterAnnotations;

    public DefaultRuntimeVisibleParameterAnnotationsAttribute(final Annotation[][] parameterAnnotations) {
        super("RuntimeVisibleParameterAnnotationsAttribute");
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

    @Override
    public Annotation[][] getParameterAnnotations() {
        return parameterAnnotations;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
