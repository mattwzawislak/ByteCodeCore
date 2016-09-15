package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.Constant;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantPoolReader implements Reader<ConstantPool> {

    private final ConstantReader constantReader = new ConstantReader();

    @Override
    public ConstantPool read(final ByteCodeReader input) throws IOException {
        final ConstantPool constantPool = new ConstantPool();
        input.pushConstants(constantPool);

        final int constantPoolCount = input.readUnsignedShort();
        final Constant[] constants = new Constant[constantPoolCount];

        // index 0 is reserved for compiler usage
        for (int i = 1; i < constantPoolCount; i++) {
            final Constant next = constantReader.read(input);

            constants[i] = next;

            final int tag = next.getTag();
            // "In retrospect, making 8-byte constants take two constant pool entries was a poor choice."
            //    ~ Someone who had a bit of sense

            // Why they did this still shocks me.
            if (tag == ConstantReader.CONSTANT_LONG || tag == ConstantReader.CONSTANT_DOUBLE) {
                i++;
            }
        }

        constantPool.setConstants(constants);
        return constantPool;
    }
}
