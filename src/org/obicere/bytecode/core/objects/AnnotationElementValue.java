package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class AnnotationElementValue extends ElementValue {

    public static final String IDENTIFIER = "AnnotationElementValue";

    private final Annotation annotation;

    public AnnotationElementValue(final Annotation annotation) {
        super(ElementValueReader.TAG_ANNOTATION);
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
