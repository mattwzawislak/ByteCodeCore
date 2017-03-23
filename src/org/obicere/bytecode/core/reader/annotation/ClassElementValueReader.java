package org.obicere.bytecode.core.reader.annotation;

import org.javacore.JavaCore;
import org.javacore.annotation.ClassElementValue;
import org.javacore.constant.ConstantUtf8;
import org.javacore.type.Type;
import org.obicere.bytecode.core.objects.annotation.DefaultClassElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassElementValueReader implements Reader<ClassElementValue> {
    @Override
    public ClassElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 name = input.readConstant();
        final Type type = JavaCore.getType(name.getValue());
        return new DefaultClassElementValue(type);
    }
}
