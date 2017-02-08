package org.obicere.bytecode.core.reader.common;

import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.common.MethodHandle;
import org.obicere.bytecode.core.objects.constant.AbstractConstant;
import org.obicere.bytecode.core.objects.constant.ConstantMethodHandle;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BootstrapMethodReader implements Reader<BootstrapMethod> {
    @Override
    public BootstrapMethod read(final ByteCodeReader input) throws IOException {
        final ConstantMethodHandle bootstrapMethodConstant = input.readConstant();
        final int numBootstrapArguments = input.readUnsignedShort();
        final AbstractConstant[] bootstrapArgumentConstants = new AbstractConstant[numBootstrapArguments];

        for(int i = 0; i < numBootstrapArguments; i++){
            bootstrapArgumentConstants[i] = input.readConstant();
        }

        final MethodHandle<DefaultJCMethod> bootstrapMethod = bootstrapMethodConstant.getHandle();
        return new BootstrapMethod(bootstrapMethod, bootstrapArgumentConstants);
    }
}
