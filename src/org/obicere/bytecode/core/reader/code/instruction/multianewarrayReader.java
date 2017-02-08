package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultMultiANewArray;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.javacore.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class multianewarrayReader implements Reader<DefaultMultiANewArray> {

    @Override
    public DefaultMultiANewArray read(final ByteCodeReader input) throws IOException {
        final DefaultConstantClass classConstant = input.readConstant();
        final Type type = Type.of(classConstant.getName());
        return new DefaultMultiANewArray(type, input.readUnsignedByte());
    }
}