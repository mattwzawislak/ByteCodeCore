package org.obicere.bytecode.core.objects.attribute;


import org.javacore.annotation.TypeAnnotation;
import org.javacore.attribute.RuntimeVisibleTypeAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeVisibleTypeAnnotationsAttribute extends AbstractAttribute implements RuntimeVisibleTypeAnnotationsAttribute {

    private final TypeAnnotation[] annotations;

    public DefaultRuntimeVisibleTypeAnnotationsAttribute(final TypeAnnotation[] annotations) {
        super("RuntimeVisibleTypeAnnotationsAttribute");
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
