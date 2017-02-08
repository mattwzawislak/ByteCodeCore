package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultGetField;
import org.obicere.bytecode.core.objects.constant.DefaultConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class getfieldReader implements Reader<DefaultGetField> {

    @Override
    public DefaultGetField read(final ByteCodeReader input) throws IOException {
        final DefaultConstantFieldRef ref = input.readConstant();
        final FieldReference reference = ref.getReference();
        return new DefaultGetField(reference);
    }
}