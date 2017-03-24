package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.constant.DefaultConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantUtf8Reader implements Reader<ConstantUtf8> {
    @Override
    public ConstantUtf8 read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantUtf8(input.readUTF());
    }
}
