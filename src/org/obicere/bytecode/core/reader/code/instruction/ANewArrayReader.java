package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JavaCore;
import org.javacore.code.instruction.ANewArray;
import org.javacore.constant.ConstantClass;
import org.javacore.type.Type;
import org.obicere.bytecode.core.objects.code.instruction.DefaultANewArray;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ANewArrayReader implements Reader<ANewArray> {

    @Override
    public ANewArray read(final ByteCodeReader input) throws IOException {
        final ConstantClass classConstant = input.readConstant();
        final Type type = JavaCore.getType(classConstant.getName());
        return new DefaultANewArray(type);
    }
}
