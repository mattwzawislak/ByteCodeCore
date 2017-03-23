package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.MethodParametersAttribute;
import org.javacore.common.Parameter;
import org.obicere.bytecode.core.objects.attribute.DefaultMethodParametersAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodParametersAttributeReader implements Reader<MethodParametersAttribute> {

    @Override
    public MethodParametersAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int parametersCount = input.readUnsignedByte();
        final Parameter[] parameters = new Parameter[parametersCount];
        for (int i = 0; i < parametersCount; i++) {
            parameters[i] = input.read(Identifier.PARAMETER);
        }
        return new DefaultMethodParametersAttribute(parameters);
    }
}
