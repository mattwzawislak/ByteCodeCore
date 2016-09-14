package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttribute extends Attribute {

    public static final String IDENTIFIER = "SourceDebugExtensionAttribute";

    private final String debugExtension;

    public SourceDebugExtensionAttribute(final String debugExtension) {
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
