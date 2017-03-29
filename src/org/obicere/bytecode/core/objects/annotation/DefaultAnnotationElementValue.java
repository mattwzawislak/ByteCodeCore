package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.Annotation;
import org.javacore.annotation.AnnotationElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultAnnotationElementValue extends AbstractElementValue implements AnnotationElementValue {

    private final Annotation annotation;

    public DefaultAnnotationElementValue(final Annotation annotation) {
        super(ElementValues.TAG_ANNOTATION);
        if(annotation == null){
            throw new NullPointerException("annotation must be non-null");
        }
        this.annotation = annotation;
    }

    public Annotation getAnnotation() {
        return annotation;
    }
}
