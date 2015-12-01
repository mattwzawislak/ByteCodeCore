package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.InnerClass;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InnerClassReader implements Reader<InnerClass> {
    @Override
    public InnerClass read(final IndexedDataInputStream input) throws IOException {
        final int innerClassInfoIndex = input.readUnsignedShort();
        final int outerClassInfoIndex = input.readUnsignedShort();
        final int innerNameIndex = input.readUnsignedShort();
        final int innerClassAccessFlags = input.readUnsignedShort();
        return new InnerClass(innerClassInfoIndex, outerClassInfoIndex, innerNameIndex, innerClassAccessFlags);
    }
}
