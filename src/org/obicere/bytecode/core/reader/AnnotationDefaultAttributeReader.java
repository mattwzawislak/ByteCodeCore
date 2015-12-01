package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.AnnotationDefaultAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationDefaultAttributeReader implements Reader<AnnotationDefaultAttribute> {

    private final ElementValueReader elementValue;

    public AnnotationDefaultAttributeReader(final ElementValueReader elementValue) {
        this.elementValue = elementValue;
    }

    @Override
    public AnnotationDefaultAttribute read(final IndexedDataInputStream input) throws IOException {
        return new AnnotationDefaultAttribute(elementValue.read(input));
    }
}
