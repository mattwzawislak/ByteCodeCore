package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.GetField;
import org.javacore.constant.ConstantFieldRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultGetField;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class GetFieldReader implements Reader<GetField> {

    @Override
    public DefaultGetField read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef ref = input.readConstant();
        final Reference<JCField> reference = ref.getReference();
        return new DefaultGetField(reference);
    }
}