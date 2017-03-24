package org.obicere.bytecode.core.reader.common;

import org.javacore.JCMethod;
import org.javacore.common.BootstrapMethod;
import org.javacore.common.MethodHandle;
import org.javacore.constant.Constant;
import org.javacore.constant.ConstantMethodHandle;
import org.obicere.bytecode.core.objects.common.DefaultBootstrapMethod;
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
        final Constant[] bootstrapArgumentConstants = new Constant[numBootstrapArguments];

        for(int i = 0; i < numBootstrapArguments; i++){
            bootstrapArgumentConstants[i] = input.readConstant();
        }

        // TODO I have to revisit this. I left in a vague type
        final MethodHandle<JCMethod> bootstrapMethod = (MethodHandle<JCMethod>) bootstrapMethodConstant.getHandle();
        return new DefaultBootstrapMethod(bootstrapMethod, bootstrapArgumentConstants);
    }
}
