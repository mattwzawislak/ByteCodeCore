package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;
import org.obicere.bytecode.core.objects.Class;

/**
 * @author Obicere
 */
public class EnumElementValue extends ElementValue {

    public static final String IDENTIFIER = "EnumElementValue";

    private final Class type;
    private final String name;

    public EnumElementValue(final Class type, final String name) {
        super(ElementValueReader.TAG_ENUM);
        this.type = type;
        this.name = name;
    }

    public Class getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
