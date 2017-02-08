package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeDynamic;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.constant.ConstantInvokeDynamic;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokedynamicReader implements Reader<DefaultInvokeDynamic> {

    @Override
    public DefaultInvokeDynamic read(final ByteCodeReader input) throws IOException {
        final ConstantInvokeDynamic callSite = input.readConstant();
        final BootstrapMethod bootstrapMethod = null;
        final MethodReference actualMethod = null;
        return new DefaultInvokeDynamic(bootstrapMethod, actualMethod);
    }
}