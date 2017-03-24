package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeInterface;
import org.javacore.constant.ConstantInterfaceMethodRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeInterface;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InvokeInterfaceReader implements Reader<InvokeInterface> {

    @Override
    public InvokeInterface read(final ByteCodeReader input) throws IOException {
        final ConstantInterfaceMethodRef ref = input.readConstant();
        final Reference<JCMethod> reference = ref.getReference();
        final int count = input.readUnsignedByte();

        // skip byte4
        input.readByte();

        return new DefaultInvokeInterface(reference, count);
    }
}