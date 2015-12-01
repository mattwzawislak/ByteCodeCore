package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttribute extends Attribute {
    private final String debugExtension;

    public SourceDebugExtensionAttribute(final String debugExtension) {
        this.debugExtension = debugExtension;
    }

    public String getDebugExtension() {
        return debugExtension;
    }

}
