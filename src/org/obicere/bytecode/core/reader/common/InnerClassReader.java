package org.obicere.bytecode.core.reader.common;

import org.javacore.common.InnerClass;
import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.common.DefaultInnerClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InnerClassReader implements Reader<InnerClass> {
    @Override
    public InnerClass read(final ByteCodeReader input) throws IOException {
        final ConstantClass innerClassInfoConstant = input.readConstant();
        final ConstantClass outerClassInfoConstant = input.readConstant();
        final ConstantUtf8 innerNameConstant = input.readConstant();
        final int innerClassAccessFlags = input.readUnsignedShort();

        // these two names can be null if Class version is 51.0 or greater
        // JLS §4.7.6
        final String innerClassInfo;
        final String outerClassInfo;
        // inner name must be non-null
        final String innerName = innerNameConstant.getValue();

        if (innerClassInfoConstant == null) {
            innerClassInfo = null;
        } else {
            innerClassInfo = innerClassInfoConstant.getName();
        }
        if (outerClassInfoConstant == null) {
            outerClassInfo = null;
        } else {
            outerClassInfo = outerClassInfoConstant.getName();
        }

        return new DefaultInnerClass(innerClassInfo, outerClassInfo, innerName, innerClassAccessFlags);
    }
}
