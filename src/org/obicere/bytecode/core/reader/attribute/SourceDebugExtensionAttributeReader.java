package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.SourceDebugExtensionAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultSourceDebugExtensionAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SourceDebugExtensionAttributeReader implements Reader<SourceDebugExtensionAttribute> {
    @Override
    public SourceDebugExtensionAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        final int length = input.readInt();
        final byte[] debugExtensionBytes = new byte[length];
        if (input.read(debugExtensionBytes) < 0) {
            throw new ClassFormatError("Reached out of file when reading source debug extension");
        }
        // it also can't be read using the default `readUtf8`, since the
        // length is 4 bytes wide (and not 2)
        final String debugExtension = new String(debugExtensionBytes, "UTF-8");
        return new DefaultSourceDebugExtensionAttribute(debugExtension);
    }
}
