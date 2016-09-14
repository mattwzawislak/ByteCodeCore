package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.anewarray;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class anewarrayReader implements Reader<anewarray> {

    @Override
    public anewarray read(final ByteCodeReader input) throws IOException {
        final ConstantClass classConstant = input.readConstant();
        final Type type = Type.of(classConstant.getName());
        return new anewarray(type);
    }
}
