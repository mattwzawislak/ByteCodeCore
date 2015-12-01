package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class BootstrapMethodsAttribute extends Attribute {

    private final BootstrapMethod[] bootstrapMethods;

    public BootstrapMethodsAttribute(final BootstrapMethod[] bootstrapMethods) {

        if (bootstrapMethods == null) {
            throw new NullPointerException("bootstrap methods not defined.");
        }

        this.bootstrapMethods = bootstrapMethods;
    }

    public BootstrapMethod[] getBootstrapMethods() {
        return bootstrapMethods;
    }

    @Override
    public void model(final DocumentBuilder builder) {

        final BootstrapMethod[] methods = bootstrapMethods;
        if (methods.length == 0) {
            return;
        }

        for (final BootstrapMethod method : methods) {
            builder.newLine();
            builder.newLine();
            method.model(builder);
        }
    }
}
