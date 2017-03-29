package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.Annotation;
import org.javacore.attribute.Attributes;
import org.javacore.attribute.RuntimeInvisibleParameterAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeInvisibleParameterAnnotationsAttribute extends AbstractAttribute implements RuntimeInvisibleParameterAnnotationsAttribute {

    private final Annotation[][] parameterAnnotations;

    public DefaultRuntimeInvisibleParameterAnnotationsAttribute(final Annotation[][] parameterAnnotations) {
        super(Attributes.RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE_NAME);
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

    @Override
    public Annotation[][] getParameterAnnotations() {
        return parameterAnnotations;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
