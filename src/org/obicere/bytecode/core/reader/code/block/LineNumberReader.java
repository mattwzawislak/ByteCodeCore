package org.obicere.bytecode.core.reader.code.block;

import org.javacore.code.LineNumber;
import org.javacore.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.DefaultLineNumber;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberReader implements Reader<LineNumber> {
    @Override
    public LineNumber read(final ByteCodeReader input) throws IOException {
        final Label start = input.readLabel();
        final int lineNumber = input.readUnsignedShort();
        return new DefaultLineNumber(start, lineNumber);
    }
}
