package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.ClassElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.javacore.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassElementValueReader implements Reader<ClassElementValue> {
    @Override
    public ClassElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 name = input.readConstant();
        final Type type = Type.of(name.getBytes());
        return new ClassElementValue(type);
    }
}
