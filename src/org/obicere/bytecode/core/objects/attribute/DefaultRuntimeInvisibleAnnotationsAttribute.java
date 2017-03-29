package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.Annotation;
import org.javacore.attribute.Attributes;
import org.javacore.attribute.RuntimeInvisibleAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeInvisibleAnnotationsAttribute extends AbstractAttribute implements RuntimeInvisibleAnnotationsAttribute {

    private final Annotation[] annotations;

    public DefaultRuntimeInvisibleAnnotationsAttribute(final Annotation[] annotations) {
        super(Attributes.RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE_NAME);
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }
        this.annotations = annotations;
    }

    @Override
    public Annotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
