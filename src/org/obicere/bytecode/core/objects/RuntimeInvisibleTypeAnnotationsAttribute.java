package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class RuntimeInvisibleTypeAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeInvisibleTypeAnnotationsAttribute";

    private final TypeAnnotation[] annotations;

    public RuntimeInvisibleTypeAnnotationsAttribute(final int length, final TypeAnnotation[] annotations) {
        super(length);
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }

        this.annotations = annotations;
    }

    public TypeAnnotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
