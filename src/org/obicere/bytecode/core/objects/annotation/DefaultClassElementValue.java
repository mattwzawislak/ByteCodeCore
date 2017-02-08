package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ClassElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;
import org.javacore.type.Type;

/**
 * @author Obicere
 */
public class DefaultClassElementValue extends AbstractElementValue implements ClassElementValue {

    private final Type type;

    public DefaultClassElementValue(final Type type) {
        super(ElementValueReader.TAG_CLASS);
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
