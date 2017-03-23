package org.obicere.bytecode.core.reader.code.table;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.JavaCore;
import org.javacore.code.LocalVariable;
import org.javacore.code.block.label.Label;
import org.javacore.constant.ConstantUtf8;
import org.javacore.type.Type;
import org.obicere.bytecode.core.objects.code.DefaultLocalVariable;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableReader implements Reader<LocalVariable> {
    @Override
    public LocalVariable read(final ByteCodeReader input) throws IOException {
        final Label start = input.readLabel();
        final Label end = input.readLabel(start);

        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getValue();
        final String descriptor = descriptorConstant.getValue();

        // its possible to have a generic type here for sure
        final JCMethod method = (JCMethod) input.getParent(Identifier.METHOD);
        final Type type = JavaCore.getType(descriptor, method);

        final int index = input.readUnsignedShort();

        return new DefaultLocalVariable(start, end, name, type, index);
    }
}
