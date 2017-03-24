package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeStatic;
import org.javacore.constant.ConstantMethodRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeStatic;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InvokeStaticReader implements Reader<InvokeStatic> {

    @Override
    public InvokeStatic read(final ByteCodeReader input) throws IOException {
        final ConstantMethodRef ref = input.readConstant();
        final Reference<JCMethod> reference = ref.getReference();
        return new DefaultInvokeStatic(reference);
    }
}