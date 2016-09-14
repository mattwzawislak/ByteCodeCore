package org.obicere.bytecode.core.reader.common;

import org.obicere.bytecode.core.objects.common.InnerClass;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InnerClassReader implements Reader<InnerClass> {
    @Override
    public InnerClass read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 innerClassInfoConstant = input.readConstant();
        final ConstantUtf8 outerClassInfoConstant = input.readConstant();
        final ConstantUtf8 innerNameConstant = input.readConstant();
        final int innerClassAccessFlags = input.readUnsignedShort();

        final String innerClassInfo = innerClassInfoConstant.getBytes();
        final String outerClassInfo = outerClassInfoConstant.getBytes();
        final String innerName = innerNameConstant.getBytes();

        return new InnerClass(innerClassInfo, outerClassInfo, innerName, innerClassAccessFlags);
    }
}
