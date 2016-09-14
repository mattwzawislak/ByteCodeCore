package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.code.instruction.invokeinterface;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokeinterfaceReader implements Reader<invokeinterface> {

    @Override
    public invokeinterface read(final ByteCodeReader input) throws IOException {
        final ConstantRef<Method> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();

        // skip count - this can be derived from the reference
        input.readByte();
        // skip byte4
        input.readByte();

        return new invokeinterface(reference);
    }
}