package org.obicere.bytecode.core.reader;

import org.javacore.JCClass;
import org.obicere.bytecode.core.objects.DefaultJCClass;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassReader implements Reader<JCClass> {

    @Override
    public JCClass read(final ByteCodeReader input) throws IOException {
        return new DefaultJCClass(input);
    }
}
