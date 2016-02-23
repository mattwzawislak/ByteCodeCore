package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.ByteCodeElement;

import java.util.LinkedList;

/**
 */
public class TypeParameters extends ByteCodeElement {

    public static final String IDENTIFIER = "TypeParameters";

    private final TypeParameter[] typeParameters;

    private TypeParameters(final TypeParameter[] typeParameters) {
        this.typeParameters = typeParameters;
    }

    public TypeParameter[] getTypeParameters() {
        return typeParameters;
    }

    public static TypeParameters parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final LinkedList<TypeParameter> typeParametersList = new LinkedList<>();
        if (string.peek() == '<') {
            string.next();
            final TypeParameter firstParameter = TypeParameter.parse(string);
            if (firstParameter == null) {
                return null;
            }
            typeParametersList.add(firstParameter);
            if (!string.hasNext('>')) {
                return null;
            }
            while (string.peek() != '>') {
                final TypeParameter typeParameter = TypeParameter.parse(string);
                if (typeParameter == null) {
                    return null;
                }
                typeParametersList.add(typeParameter);
            }
            // consume the >
            string.next();
        }
        return new TypeParameters(typeParametersList.toArray(new TypeParameter[typeParametersList.size()]));
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
