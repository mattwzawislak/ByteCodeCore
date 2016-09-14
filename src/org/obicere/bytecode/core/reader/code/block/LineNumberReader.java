package org.obicere.bytecode.core.reader.code.block;

import org.obicere.bytecode.core.objects.code.block.LineNumber;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberReader implements Reader<LineNumber> {
    @Override
    public LineNumber read(final ByteCodeReader input) throws IOException {
        // can't use labels here as this information is used to make labels
        final int startPC = input.readUnsignedShort();
        final int lineNumber = input.readUnsignedShort();
        return new LineNumber(startPC, lineNumber);
    }
}
