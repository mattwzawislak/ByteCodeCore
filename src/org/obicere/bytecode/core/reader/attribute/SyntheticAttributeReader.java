package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.SyntheticAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultSyntheticAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SyntheticAttributeReader implements Reader<SyntheticAttribute> {

    @Override
    public SyntheticAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        return DefaultSyntheticAttribute.getInstance();
    }
}
