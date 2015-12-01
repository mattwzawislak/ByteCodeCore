package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;
import org.obicere.bytecode.viewer.util.ByteCodeUtils;

/**
 * @author Obicere
 */
public class Annotation extends ByteCodeElement {

    private final int typeIndex;

    private final ElementValuePair[] elementValuePairs;

    public Annotation(final int typeIndex, final ElementValuePair[] elementValuePairs) {

        if (elementValuePairs == null) {
            throw new NullPointerException("element value pairs not defined.");
        }
        this.typeIndex = typeIndex;
        this.elementValuePairs = elementValuePairs;
    }

    public int getTypeIndex() {
        return typeIndex;
    }

    public ElementValuePair[] getElementValuePairs() {
        return elementValuePairs;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        final String identifier = ByteCodeUtils.getQualifiedName(builder.getConstantPool().getAsString(typeIndex));
        builder.addAnnotation(identifier);
        if (elementValuePairs.length > 0) {
            builder.add("(");
            boolean first = true;
            for (final ElementValuePair elementValuePair : elementValuePairs) {
                if (!first) {
                    builder.comma();
                }
                elementValuePair.model(builder);
                first = false;
            }
            builder.add(")");
        }
    }
}
