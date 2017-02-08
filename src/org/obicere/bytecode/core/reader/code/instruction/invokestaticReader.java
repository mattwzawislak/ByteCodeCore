package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeStatic;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokestaticReader implements Reader<DefaultInvokeStatic> {

    @Override
    public DefaultInvokeStatic read(final ByteCodeReader input) throws IOException {
        final ConstantRef<DefaultJCMethod> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();
        return new DefaultInvokeStatic(reference);
    }
}