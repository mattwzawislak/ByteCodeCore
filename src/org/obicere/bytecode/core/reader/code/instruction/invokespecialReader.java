package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeSpecial;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokespecialReader implements Reader<DefaultInvokeSpecial> {

    @Override
    public DefaultInvokeSpecial read(final ByteCodeReader input) throws IOException {
        final ConstantRef<DefaultJCMethod> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();
        return new DefaultInvokeSpecial(reference);
    }
}