package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.DefaultJCClass;
import org.obicere.bytecode.core.objects.attribute.ExceptionsAttribute;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.javacore.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ExceptionsAttributeReader implements Reader<ExceptionsAttribute> {
    @Override
    public ExceptionsAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numberOfExceptions = input.readUnsignedShort();
        final DefaultJCClass[] exceptions = new DefaultJCClass[numberOfExceptions];
        for(int i = 0; i < numberOfExceptions; i++){
            final DefaultConstantClass constantClass = input.readConstant();
            final DefaultJCClass type = (DefaultJCClass) Type.of(constantClass.getName());
            exceptions[i] = type;
        }
        return new ExceptionsAttribute(exceptions);
    }
}
