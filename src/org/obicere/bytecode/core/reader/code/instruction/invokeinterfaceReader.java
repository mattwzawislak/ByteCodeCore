package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeInterface;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokeinterfaceReader implements Reader<DefaultInvokeInterface> {

    @Override
    public DefaultInvokeInterface read(final ByteCodeReader input) throws IOException {
        final ConstantRef<DefaultJCMethod> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();

        // skip count - this can be derived from the reference
        input.readByte();
        // skip byte4
        input.readByte();

        return new DefaultInvokeInterface(reference);
    }
}