package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.MethodParametersAttribute;
import org.obicere.bytecode.core.objects.common.Parameter;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.common.ParameterReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodParametersAttributeReader implements Reader<MethodParametersAttribute> {

    private final ParameterReader parameter = new ParameterReader();

    @Override
    public MethodParametersAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int parametersCount = input.readUnsignedByte();
        final Parameter[] parameters = new Parameter[parametersCount];
        for (int i = 0; i < parametersCount; i++) {
            parameters[i] = parameter.read(input);
        }
        return new MethodParametersAttribute(parameters);
    }
}
