package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class AnnotationElementValue extends ElementValue {

    public static final String IDENTIFIER = "AnnotationElementValue";

    private static final int TAG = '@';

    private final Annotation annotation;

    public AnnotationElementValue(final Annotation annotation) {
        super(TAG);
        if(annotation == null){
            throw new NullPointerException("annotation must be non-null");
        }
        this.annotation = annotation;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
