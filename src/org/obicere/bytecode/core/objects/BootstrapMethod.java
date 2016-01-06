package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class BootstrapMethod extends ByteCodeElement {

    public static final String IDENTIFIER = "BootstrapMethod";

    private final int   bootstrapMethodRef;
    private final int[] bootstrapArguments;

    public BootstrapMethod(final int bootstrapMethodRef, final int[] bootstrapArguments) {
        if (bootstrapArguments == null) {
            throw new NullPointerException("bootstrap arguments must be non-null");
        }
        this.bootstrapMethodRef = bootstrapMethodRef;
        this.bootstrapArguments = bootstrapArguments;
    }

    public int getBootstrapMethodRef() {
        return bootstrapMethodRef;
    }

    public int[] getBootstrapArguments() {
        return bootstrapArguments;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
