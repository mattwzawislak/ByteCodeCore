package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.SourceDebugExtensionAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttributeReader implements Reader<SourceDebugExtensionAttribute> {
    @Override
    public SourceDebugExtensionAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final byte[] debugExtensionBytes = new byte[length];
        if (input.read(debugExtensionBytes) < 0) {
            throw new ClassFormatError("reached out of file when reading source debug extension");
        }
        final String debugExtension = new String(debugExtensionBytes, "UTF-8");
        return new SourceDebugExtensionAttribute(length, debugExtension);
    }
}
