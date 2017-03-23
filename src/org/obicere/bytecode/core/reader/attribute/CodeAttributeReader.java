package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.CodeAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultCodeAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CodeAttributeReader implements Reader<CodeAttribute> {

    @Override
    public CodeAttribute read(final ByteCodeReader input) throws IOException {
        return new DefaultCodeAttribute(input);
    }
}
