package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.MethodParametersAttribute;
import org.obicere.bytecode.core.objects.Parameter;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodParametersAttributeReader implements Reader<MethodParametersAttribute> {

    private final ParameterReader parameter = new ParameterReader();

    @Override
    public MethodParametersAttribute read(final IndexedDataInputStream input) throws IOException {
        final int parametersCount = input.readUnsignedByte();
        final Parameter[] parameters = new Parameter[parametersCount];
        for(int i = 0; i < parametersCount; i++){
            parameters[i] = parameter.read(input);
        }
        return new MethodParametersAttribute(parameters);
    }
}
