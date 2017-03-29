package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.ConstantValueAttribute;
import org.javacore.constant.Constant;
import org.obicere.bytecode.core.objects.attribute.DefaultConstantValueAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantValueAttributeReader implements Reader<ConstantValueAttribute> {
    @Override
    public ConstantValueAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final Constant constant = input.readConstant();
        return new DefaultConstantValueAttribute(constant);
    }
}
