package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.putfield;
import org.obicere.bytecode.core.objects.constant.ConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putfieldReader implements Reader<putfield> {

    @Override
    public putfield read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef constant = input.readConstant();
        final FieldReference reference = constant.getReference();
        return new putfield(reference);
    }
}