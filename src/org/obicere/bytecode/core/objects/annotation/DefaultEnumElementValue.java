package org.obicere.bytecode.core.objects.annotation;

import org.javacore.JCClass;
import org.javacore.annotation.EnumElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultEnumElementValue extends AbstractElementValue implements EnumElementValue {

    private final JCClass type;
    private final String  name;

    public DefaultEnumElementValue(final JCClass type, final String name) {
        super(ElementValueReader.TAG_ENUM);
        this.type = type;
        this.name = name;
    }

    @Override
    public JCClass getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
