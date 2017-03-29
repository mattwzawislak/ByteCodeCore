package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.TypeAnnotation;
import org.javacore.attribute.Attributes;
import org.javacore.attribute.RuntimeInvisibleTypeAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeInvisibleTypeAnnotationsAttribute extends AbstractAttribute implements RuntimeInvisibleTypeAnnotationsAttribute {

    private final TypeAnnotation[] annotations;

    public DefaultRuntimeInvisibleTypeAnnotationsAttribute(final TypeAnnotation[] annotations) {
        super(Attributes.RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE_NAME);
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }

        this.annotations = annotations;
    }

    @Override
    public TypeAnnotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
