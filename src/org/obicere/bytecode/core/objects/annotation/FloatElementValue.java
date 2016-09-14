package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class FloatElementValue extends ElementValue {

    public static final String IDENTIFIER = "FloatElementValue";

    private final float value;

    public FloatElementValue(final float value) {
        super(ElementValueReader.TAG_FLOAT);
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
