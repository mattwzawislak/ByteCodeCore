package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.common.Parameter;

/**
 * @author Obicere
 */
public class MethodParametersAttribute extends Attribute {

    public static final String IDENTIFIER = "MethodParametersAttribute";

    private final Parameter[] parameters;

    public MethodParametersAttribute(final Parameter[] parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must be non-null");
        }

        this.parameters = parameters;
    }

    public Parameter[] getParameters() {
        return parameters;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
