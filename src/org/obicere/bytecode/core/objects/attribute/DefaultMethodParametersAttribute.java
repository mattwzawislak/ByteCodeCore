package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.MethodParametersAttribute;
import org.javacore.common.Parameter;

/**
 * @author Obicere
 */
public class DefaultMethodParametersAttribute extends AbstractAttribute implements MethodParametersAttribute {

    private final Parameter[] parameters;

    public DefaultMethodParametersAttribute(final Parameter[] parameters) {
        super(Attributes.METHOD_PARAMETERS_ATTRIBUTE_NAME);
        if (parameters == null) {
            throw new NullPointerException("parameters must be non-null");
        }

        this.parameters = parameters;
    }

    @Override
    public Parameter[] getParameters() {
        return parameters;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
