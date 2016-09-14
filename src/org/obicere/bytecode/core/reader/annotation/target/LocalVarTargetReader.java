package org.obicere.bytecode.core.reader.annotation.target;

import org.obicere.bytecode.core.objects.annotation.target.LocalVar;
import org.obicere.bytecode.core.objects.annotation.target.LocalVarTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVarTargetReader implements Reader<LocalVarTarget> {

    private final LocalVarReader localVar = new LocalVarReader();

    @Override
    public LocalVarTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int tableLength = input.readUnsignedShort();
        final LocalVar[] table = new LocalVar[tableLength];
        for (int i = 0; i < tableLength; i++) {
            table[i] = localVar.read(input);
        }
        return new LocalVarTarget(targetType, table);
    }
}
