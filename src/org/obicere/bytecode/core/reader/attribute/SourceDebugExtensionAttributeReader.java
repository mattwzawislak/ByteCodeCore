package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.SourceDebugExtensionAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttributeReader implements Reader<SourceDebugExtensionAttribute> {
    @Override
    public SourceDebugExtensionAttribute read(final ByteCodeReader input) throws IOException {
        // can't discard the length, I think this is the only case...
        // thanks, Sun
        final int length = input.readInt();
        final byte[] debugExtensionBytes = new byte[length];
        if (input.read(debugExtensionBytes) < 0) {
            throw new ClassFormatError("reached out of file when reading source debug extension");
        }
        final String debugExtension = new String(debugExtensionBytes, "UTF-8");
        return new SourceDebugExtensionAttribute(debugExtension);
    }
}
