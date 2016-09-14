package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class ClassElementValue extends ElementValue {

    public static final String IDENTIFIER = "ClassElementValue";

    private final Type value;

    public ClassElementValue(final Type value) {
        super(ElementValueReader.TAG_CLASS);
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
