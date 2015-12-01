package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVar;
import org.obicere.bytecode.core.objects.LocalVarTarget;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVarTargetReader implements Reader<LocalVarTarget> {

    private final LocalVarReader localVar = new LocalVarReader();

    @Override
    public LocalVarTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int tableLength = input.readUnsignedShort();
        final LocalVar[] table = new LocalVar[tableLength];
        for(int i = 0; i < tableLength; i++){
            table[i] = localVar.read(input);
        }
        return new LocalVarTarget(targetType, table);
    }
}
