package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JCClass;
import org.javacore.JavaCore;
import org.javacore.code.instruction.New;
import org.javacore.constant.ConstantClass;
import org.obicere.bytecode.core.objects.code.instruction.DefaultNew;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class NewReader implements Reader<New> {

    @Override
    public New read(final ByteCodeReader input) throws IOException {
        final ConstantClass classConstant = input.readConstant();
        final JCClass type = JavaCore.getClass(classConstant.getName());
        return new DefaultNew(type);
    }
}