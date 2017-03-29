package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ClassElementValue;
import org.javacore.annotation.ElementValues;
import org.javacore.type.Type;

/**
 * @author Obicere
 */
public class DefaultClassElementValue extends AbstractElementValue implements ClassElementValue {

    private final Type type;

    public DefaultClassElementValue(final Type type) {
        super(ElementValues.TAG_CLASS);
        if (type == null) {
            throw new NullPointerException("type must be non-null");
        }
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
