package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.GetStatic;
import org.javacore.constant.ConstantFieldRef;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.code.instruction.DefaultGetStatic;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class GetStaticReader implements Reader<GetStatic> {

    @Override
    public GetStatic read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef ref = input.readConstant();
        final Reference<JCField> reference = ref.getReference();
        return new DefaultGetStatic(reference);
    }
}