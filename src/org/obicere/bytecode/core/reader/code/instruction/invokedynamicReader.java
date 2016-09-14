package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.invokedynamic;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.constant.ConstantInvokeDynamic;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokedynamicReader implements Reader<invokedynamic> {

    @Override
    public invokedynamic read(final ByteCodeReader input) throws IOException {
        final ConstantInvokeDynamic callSite = input.readConstant();
        final BootstrapMethod bootstrapMethod = callSite.getBootstrapMethod();
        final MethodReference actualMethod = callSite.getActualMethod();
        return new invokedynamic(bootstrapMethod, actualMethod);
    }
}