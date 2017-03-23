package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.DeprecatedAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultDeprecatedAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DeprecatedAttributeReader implements Reader<DeprecatedAttribute> {

    @Override
    public DeprecatedAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        return DefaultDeprecatedAttribute.getInstance();
    }
}
