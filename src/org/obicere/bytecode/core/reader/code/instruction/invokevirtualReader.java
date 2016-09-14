package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.code.instruction.invokevirtual;
import org.obicere.bytecode.core.objects.constant.ConstantRef;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class invokevirtualReader implements Reader<invokevirtual> {

    @Override
    public invokevirtual read(final ByteCodeReader input) throws IOException {
        final ConstantRef<Method> ref = input.readConstant();
        final MethodReference reference = (MethodReference) ref.getReference();
        return new invokevirtual(reference);
    }
}