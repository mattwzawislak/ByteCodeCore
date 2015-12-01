package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.BootstrapMethod;
import org.obicere.bytecode.core.objects.BootstrapMethodsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BootstrapMethodsAttributeReader implements Reader<BootstrapMethodsAttribute> {

    private final BootstrapMethodReader bootstrapMethod = new BootstrapMethodReader();

    @Override
    public BootstrapMethodsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int numBootstrapMethods = input.readUnsignedShort();
        final BootstrapMethod[] bootstrapMethods = new BootstrapMethod[numBootstrapMethods];
        for (int i = 0; i < numBootstrapMethods; i++) {
            bootstrapMethods[i] = bootstrapMethod.read(input);
        }
        return new BootstrapMethodsAttribute(bootstrapMethods);
    }
}
