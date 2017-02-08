package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultPutStatic;
import org.obicere.bytecode.core.objects.constant.DefaultConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putstaticReader implements Reader<DefaultPutStatic> {

    @Override
    public DefaultPutStatic read(final ByteCodeReader input) throws IOException {
        final DefaultConstantFieldRef constant = input.readConstant();
        final FieldReference reference = constant.getReference();
        return new DefaultPutStatic(reference);
    }
}