package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class MethodParametersAttribute extends Attribute {

    private final Parameter[] parameters;

    public MethodParametersAttribute(final Parameter[] parameters) {

        if (parameters == null) {
            throw new NullPointerException("parameters not defined.");
        }

        this.parameters = parameters;
    }

    public Parameter[] getParameters() {
        return parameters;
    }

}
