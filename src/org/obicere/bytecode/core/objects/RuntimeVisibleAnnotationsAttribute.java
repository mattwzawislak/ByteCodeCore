package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class RuntimeVisibleAnnotationsAttribute extends Attribute {

    public static final String IDENTIFIER = "RuntimeVisibleAnnotationsAttribute";

    private final Annotation[] annotations;

    public RuntimeVisibleAnnotationsAttribute(final int length, final Annotation[] annotations) {
        super(length);
        if (annotations == null) {
            throw new NullPointerException("annotations must be non-null");
        }
        this.annotations = annotations;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
