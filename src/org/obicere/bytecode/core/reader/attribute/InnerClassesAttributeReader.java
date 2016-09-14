package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.InnerClassesAttribute;
import org.obicere.bytecode.core.objects.common.InnerClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.common.InnerClassReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InnerClassesAttributeReader implements Reader<InnerClassesAttribute> {

    private final InnerClassReader innerClass = new InnerClassReader();

    @Override
    public InnerClassesAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numberOfClasses = input.readUnsignedShort();
        final InnerClass[] classes = new InnerClass[numberOfClasses];
        for (int i = 0; i < numberOfClasses; i++) {
            classes[i] = innerClass.read(input);

        }
        return new InnerClassesAttribute(classes);
    }
}
