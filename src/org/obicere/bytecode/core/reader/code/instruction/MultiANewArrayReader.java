package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JavaCore;
import org.javacore.code.instruction.MultiANewArray;
import org.javacore.constant.ConstantClass;
import org.javacore.type.Type;
import org.obicere.bytecode.core.objects.code.instruction.DefaultMultiANewArray;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MultiANewArrayReader implements Reader<MultiANewArray> {

    @Override
    public MultiANewArray read(final ByteCodeReader input) throws IOException {
        final ConstantClass classConstant = input.readConstant();
        final Type type = JavaCore.getType(classConstant.getName());
        return new DefaultMultiANewArray(type, input.readUnsignedByte());
    }
}