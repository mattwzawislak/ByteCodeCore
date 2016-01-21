package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttribute extends Attribute {

    public static final String IDENTIFIER = "SourceDebugExtensionAttribute";

    private final String debugExtension;

    public SourceDebugExtensionAttribute(final int length, final String debugExtension) {
        super(length);
        if (debugExtension == null) {
            throw new NullPointerException("debug extension must be non-null");
        }

        this.debugExtension = debugExtension;
    }

    public String getDebugExtension() {
        return debugExtension;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
