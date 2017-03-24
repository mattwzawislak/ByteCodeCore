package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.PutField;
import org.javacore.constant.ConstantFieldRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultPutField;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class PutFieldReader implements Reader<PutField> {

    @Override
    public PutField read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef constant = input.readConstant();
        final Reference<JCField> reference = constant.getReference();
        return new DefaultPutField(reference);
    }
}