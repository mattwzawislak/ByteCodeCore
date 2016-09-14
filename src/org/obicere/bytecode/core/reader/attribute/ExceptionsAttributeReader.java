package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.attribute.ExceptionsAttribute;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
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
        final Class[] exceptions = new Class[numberOfExceptions];
        for(int i = 0; i < numberOfExceptions; i++){
            final ConstantClass constantClass = input.readConstant();
            final Class type = (Class) Type.of(constantClass.getName());
            exceptions[i] = type;
        }
        return new ExceptionsAttribute(exceptions);
    }
}
