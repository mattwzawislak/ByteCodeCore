package org.obicere.bytecode.core.objects.attribute;

import org.javacore.annotation.ElementValue;
import org.javacore.attribute.AnnotationDefaultAttribute;
import org.javacore.attribute.Attributes;

/**
 * @author Obicere
 */
public class DefaultAnnotationDefaultAttribute extends AbstractAttribute implements AnnotationDefaultAttribute {

    private final ElementValue defaultValue;

    public DefaultAnnotationDefaultAttribute(final ElementValue defaultValue) {
        super(Attributes.ANNOTATION_DEFAULT_ATTRIBUTE_NAME);
        if (defaultValue == null) {
            throw new NullPointerException("default value must be non-null");
        }
        this.defaultValue = defaultValue;
    }

    @Override
    public ElementValue getDefaultValue() {
        return defaultValue;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
