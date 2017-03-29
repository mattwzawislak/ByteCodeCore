package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.BootstrapMethodsAttribute;
import org.javacore.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.attribute.DefaultBootstrapMethodsAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BootstrapMethodsAttributeReader implements Reader<BootstrapMethodsAttribute> {

    @Override
    public BootstrapMethodsAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final int numBootstrapMethods = input.readUnsignedShort();
        final BootstrapMethod[] bootstrapMethods = new BootstrapMethod[numBootstrapMethods];
        for (int i = 0; i < numBootstrapMethods; i++) {
            bootstrapMethods[i] = input.read(Identifier.BOOTSTRAP_METHOD);
        }
        return new DefaultBootstrapMethodsAttribute(bootstrapMethods);
    }
}
