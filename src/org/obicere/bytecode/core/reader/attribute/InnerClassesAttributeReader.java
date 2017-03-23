package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.InnerClassesAttribute;
import org.javacore.common.InnerClass;
import org.obicere.bytecode.core.objects.attribute.DefaultInnerClassesAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InnerClassesAttributeReader implements Reader<InnerClassesAttribute> {

    @Override
    public InnerClassesAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numberOfClasses = input.readUnsignedShort();
        final InnerClass[] classes = new InnerClass[numberOfClasses];
        for (int i = 0; i < numberOfClasses; i++) {
            classes[i] = input.read(Identifier.INNER_CLASS);

        }
        return new DefaultInnerClassesAttribute(classes);
    }
}
