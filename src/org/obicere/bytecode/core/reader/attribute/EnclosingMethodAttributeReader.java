package org.obicere.bytecode.core.reader.attribute;

import org.javacore.JCClass;
import org.javacore.JCMethod;
import org.javacore.JavaCore;
import org.javacore.attribute.EnclosingMethodAttribute;
import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantNameAndType;
import org.obicere.bytecode.core.objects.attribute.DefaultEnclosingMethodAttribute;
import org.obicere.bytecode.core.reader.Reader;
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

        final JCClass cls = JavaCore.getClass(className.getName());

        final JCMethod method;

        if (methodNameAndType != null) {
            final String name = methodNameAndType.getName();
            final String type = methodNameAndType.getType();
            // method = cls.getMethod(name, type);
            method = null;
        } else {
            method = null;
        }

        return new DefaultEnclosingMethodAttribute(cls, method);
    }
}
