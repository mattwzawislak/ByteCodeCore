package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultPutField;
import org.obicere.bytecode.core.objects.constant.DefaultConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putfieldReader implements Reader<DefaultPutField> {

    @Override
    public DefaultPutField read(final ByteCodeReader input) throws IOException {
        final DefaultConstantFieldRef constant = input.readConstant();
        final FieldReference reference = constant.getReference();
        return new DefaultPutField(reference);
    }
}