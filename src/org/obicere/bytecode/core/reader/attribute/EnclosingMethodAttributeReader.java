package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.attribute.EnclosingMethodAttribute;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.objects.constant.ConstantNameAndType;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EnclosingMethodAttributeReader implements Reader<EnclosingMethodAttribute> {
    @Override
    public EnclosingMethodAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final ConstantClass className = input.readConstant();
        final ConstantNameAndType methodNameAndType = input.readConstant();

        final Class cls = (Class) Type.of(className.getName());

        final Method method;

        if (methodNameAndType != null) {
            final String name = methodNameAndType.getName();
            final String type = methodNameAndType.getType();
            // method = cls.getMethod(name, type);
            method = null;
        } else {
            method = null;
        }

        return new EnclosingMethodAttribute(cls, method);
    }
}
