package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.putstatic;
import org.obicere.bytecode.core.objects.constant.ConstantFieldRef;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class putstaticReader implements Reader<putstatic> {

    @Override
    public putstatic read(final ByteCodeReader input) throws IOException {
        final ConstantFieldRef constant = input.readConstant();
        final FieldReference reference = constant.getReference();
        return new putstatic(reference);
    }
}