package org.obicere.bytecode.core.reader.attribute;

import org.javacore.JCClass;
import org.javacore.JavaCore;
import org.javacore.attribute.ExceptionsAttribute;
import org.javacore.constant.ConstantClass;
import org.obicere.bytecode.core.objects.attribute.DefaultExceptionsAttribute;
import org.obicere.bytecode.core.reader.Reader;
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
        final JCClass[] exceptions = new JCClass[numberOfExceptions];
        for(int i = 0; i < numberOfExceptions; i++){
            final ConstantClass constantClass = input.readConstant();
            exceptions[i] = JavaCore.getClass(constantClass.getName());
        }
        return new DefaultExceptionsAttribute(exceptions);
    }
}
