package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.SourceDebugExtensionAttribute;

/**
 * @author Obicere
 */
public class DefaultSourceDebugExtensionAttribute extends AbstractAttribute implements SourceDebugExtensionAttribute {

    private final String debugExtension;

    public DefaultSourceDebugExtensionAttribute(final String debugExtension) {
        super(Attributes.SOURCE_DEBUG_EXTENSION_ATTRIBUTE_NAME);
        if (debugExtension == null) {
            throw new NullPointerException("debug extension must be non-null");
        }

        this.debugExtension = debugExtension;
    }

    @Override
    public String getDebugExtension() {
        return debugExtension;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
