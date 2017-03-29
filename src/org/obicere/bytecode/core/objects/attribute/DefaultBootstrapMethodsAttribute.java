package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.BootstrapMethodsAttribute;
import org.javacore.common.BootstrapMethod;

/**
 * @author Obicere
 */
public class DefaultBootstrapMethodsAttribute extends AbstractAttribute implements BootstrapMethodsAttribute {

    private final BootstrapMethod[] bootstrapMethods;

    public DefaultBootstrapMethodsAttribute(final BootstrapMethod[] bootstrapMethods) {
        super(Attributes.BOOTSTRAP_METHODS_ATTRIBUTE_NAME);
        if (bootstrapMethods == null) {
            throw new NullPointerException("bootstrap methods must be non-null");
        }
        this.bootstrapMethods = bootstrapMethods;
    }

    public BootstrapMethod[] getMethods() {
        return bootstrapMethods;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
