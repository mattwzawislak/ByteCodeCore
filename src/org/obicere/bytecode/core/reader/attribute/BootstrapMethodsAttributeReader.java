package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.BootstrapMethodsAttribute;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.reader.common.BootstrapMethodReader;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BootstrapMethodsAttributeReader implements Reader<BootstrapMethodsAttribute> {

    private final BootstrapMethodReader bootstrapMethod = new BootstrapMethodReader();

    @Override
    public BootstrapMethodsAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numBootstrapMethods = input.readUnsignedShort();
        final BootstrapMethod[] bootstrapMethods = new BootstrapMethod[numBootstrapMethods];
        for (int i = 0; i < numBootstrapMethods; i++) {
            bootstrapMethods[i] = bootstrapMethod.read(input);
        }
        return new BootstrapMethodsAttribute(bootstrapMethods);
    }
}
