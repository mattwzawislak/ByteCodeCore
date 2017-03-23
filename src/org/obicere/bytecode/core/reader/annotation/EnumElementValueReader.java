package org.obicere.bytecode.core.reader.annotation;

import org.javacore.JCClass;
import org.javacore.JavaCore;
import org.javacore.annotation.EnumElementValue;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.annotation.DefaultEnumElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EnumElementValueReader implements Reader<EnumElementValue> {
    @Override
    public EnumElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 typeName = input.readConstant();
        final JCClass type = JavaCore.getClass(typeName.getValue());
        final ConstantUtf8 name = input.readConstant();
        return new DefaultEnumElementValue(type, name.getValue());
    }
}
