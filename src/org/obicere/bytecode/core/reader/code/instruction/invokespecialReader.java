package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.code.instruction.invokespecial;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokespecialReader implements Reader<invokespecial> {

    @Override
    public invokespecial read(final ByteCodeReader input) throws IOException {
        final ConstantRef<Method> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();
        return new invokespecial(reference);
    }
}