package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.annotation.EnumElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EnumElementValueReader implements Reader<EnumElementValue> {
    @Override
    public EnumElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 typeName = input.readConstant();
        final Class type = (Class) Type.of(typeName.getBytes());
        final ConstantUtf8 name = input.readConstant();
        return new EnumElementValue(type, name.getBytes());
    }
}
