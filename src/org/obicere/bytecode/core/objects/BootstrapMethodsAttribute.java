package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class BootstrapMethodsAttribute extends Attribute {

    public static final String IDENTIFIER = "BootstrapMethodsAttribute";

    private final BootstrapMethod[] bootstrapMethods;

    public BootstrapMethodsAttribute(final int length, final BootstrapMethod[] bootstrapMethods) {
        super(length);
        if (bootstrapMethods == null) {
            throw new NullPointerException("bootstrap methods must be non-null");
        }
        this.bootstrapMethods = bootstrapMethods;
    }

    public BootstrapMethod[] getBootstrapMethods() {
        return bootstrapMethods;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
