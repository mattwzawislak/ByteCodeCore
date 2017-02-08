package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.DefaultJCClass;
import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.objects.attribute.EnclosingMethodAttribute;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.objects.constant.ConstantNameAndType;
import org.obicere.bytecode.core.reader.Reader;
import org.javacore.type.Type;
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
        final DefaultConstantClass className = input.readConstant();
        final ConstantNameAndType methodNameAndType = input.readConstant();

        final DefaultJCClass cls = (DefaultJCClass) Type.of(className.getName());

        final DefaultJCMethod method;

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
