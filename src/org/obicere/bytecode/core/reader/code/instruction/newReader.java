package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultNew;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.javacore.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class newReader implements Reader<DefaultNew> {

    @Override
    public DefaultNew read(final ByteCodeReader input) throws IOException {
        final DefaultConstantClass classConstant = input.readConstant();
        final Type type = Type.of(classConstant.getName());
        return new DefaultNew(type);
    }
}