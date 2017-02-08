package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.DefaultJCClass;
import org.obicere.bytecode.core.reader.constant.ConstantPoolReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassReader implements Reader<DefaultJCClass> {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    private final ConstantPoolReader constantPoolReader = new ConstantPoolReader();

    @Override
    public DefaultJCClass read(final ByteCodeReader input) throws IOException {
        return new DefaultJCClass(input);
    }

    public ConstantPoolReader getConstantPoolReader() {
        return constantPoolReader;
    }
}
