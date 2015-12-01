package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class AnnotationDefaultAttribute extends Attribute {

    private final ElementValue defaultValue;

    public AnnotationDefaultAttribute(final ElementValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ElementValue getDefaultValue(){
        return defaultValue;
    }
}
