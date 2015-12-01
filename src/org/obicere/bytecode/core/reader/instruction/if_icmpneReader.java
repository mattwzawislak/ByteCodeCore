package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmpne;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpneReader implements Reader<if_icmpne> {

    @Override
    public if_icmpne read(final IndexedDataInputStream input) throws IOException {
        return new if_icmpne(input.readUnsignedByte(), input.readUnsignedByte());
    }
}