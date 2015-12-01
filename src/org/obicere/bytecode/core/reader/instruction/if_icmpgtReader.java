package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.if_icmpgt;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpgtReader implements Reader<if_icmpgt> {

    @Override
    public if_icmpgt read(final IndexedDataInputStream input) throws IOException {
        return new if_icmpgt(input.readUnsignedByte(), input.readUnsignedByte());
    }
}