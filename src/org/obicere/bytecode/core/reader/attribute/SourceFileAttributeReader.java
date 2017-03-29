package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.SourceFileAttribute;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.attribute.DefaultSourceFileAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SourceFileAttributeReader implements Reader<SourceFileAttribute> {

    @Override
    public SourceFileAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final ConstantUtf8 sourceFileConstant = input.readConstant();
        return new DefaultSourceFileAttribute(sourceFileConstant.getValue());
    }
}
