package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LineNumber;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberReader implements Reader<LineNumber> {
    @Override
    public LineNumber read(final IndexedDataInputStream input) throws IOException {
        final int startPC = input.readUnsignedShort();
        final int lineNumber = input.readUnsignedShort();
        return new LineNumber(startPC, lineNumber);
    }
}
