package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.getstatic;
import org.obicere.bytecode.core.objects.constant.ConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class getstaticReader implements Reader<getstatic> {

    @Override
    public getstatic read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef ref = input.readConstant();
        final FieldReference reference = ref.getReference();
        return new getstatic(reference);
    }
}