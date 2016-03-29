package org.obicere.bytecode.core.reader.meta;

import org.obicere.bytecode.core.objects.ConstantPool;
import org.obicere.bytecode.core.objects.meta.MetaClassFile;
import org.obicere.bytecode.core.reader.ConstantPoolReader;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class MetaClassFileReader implements Reader<MetaClassFile> {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    private final ConstantPoolReader constantPoolReader = new ConstantPoolReader();

    @Override
    public MetaClassFile read(final IndexedDataInputStream input) throws IOException {
        final int magic = input.readInt();
        if (magic != MAGIC_NUMBER) {
            throw new ClassFormatError("invalid magic number constant: " + magic);
        }

        input.readUnsignedShort(); // minor
        input.readUnsignedShort(); // major

        final ConstantPool constantPool = constantPoolReader.read(input);
        final int accessFlags = input.readUnsignedShort();
        final int thisClass = input.readUnsignedShort();

        final String thisClassName = constantPool.getAsString(thisClass);

        return new MetaClassFile(accessFlags, thisClassName);
    }
}
