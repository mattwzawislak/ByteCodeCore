package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeVirtual;
import org.javacore.constant.ConstantMethodRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeVirtual;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InvokeVirtualReader implements Reader<InvokeVirtual> {

    @Override
    public InvokeVirtual read(final ByteCodeReader input) throws IOException {
        final ConstantMethodRef ref = input.readConstant();
        final Reference<JCMethod> reference = ref.getReference();
        return new DefaultInvokeVirtual(reference);
    }
}