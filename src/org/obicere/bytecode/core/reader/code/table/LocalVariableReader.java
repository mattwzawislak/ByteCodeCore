package org.obicere.bytecode.core.reader.code.table;

import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.objects.code.table.LocalVariable;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableReader implements Reader<LocalVariable> {
    @Override
    public LocalVariable read(final ByteCodeReader input) throws IOException {
        final int startPC = input.readUnsignedShort();
        final int length = input.readUnsignedShort();

        final LazyLabel start = new LazyLabel(startPC);
        final LazyLabel end = new LazyLabel(startPC + length);

        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getBytes();
        final String descriptor = descriptorConstant.getBytes();
        final Type type = Type.of(descriptor);

        final int index = input.readUnsignedShort();

        return new LocalVariable(start, end, name, type, index);
    }
}
