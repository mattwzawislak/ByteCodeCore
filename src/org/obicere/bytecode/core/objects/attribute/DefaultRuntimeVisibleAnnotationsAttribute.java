package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.Annotation;
import org.javacore.attribute.RuntimeVisibleAnnotationsAttribute;

/**
 * @author Obicere
 */
public class DefaultRuntimeVisibleAnnotationsAttribute extends AbstractAttribute implements RuntimeVisibleAnnotationsAttribute {

    private final Annotation[] annotations;

    public DefaultRuntimeVisibleAnnotationsAttribute(final Annotation[] annotations) {
        super("RuntimeVisibleAnnotationsAttribute");
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
