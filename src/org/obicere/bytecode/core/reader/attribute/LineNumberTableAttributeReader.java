package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.LineNumberTableAttribute;
import org.obicere.bytecode.core.objects.code.block.LineNumber;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.block.LineNumberReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberTableAttributeReader implements Reader<LineNumberTableAttribute> {

    private final LineNumberReader lineNumber = new LineNumberReader();

    @Override
    public LineNumberTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int lineNumberTableLength = input.readUnsignedShort();
        final LineNumber[] lineNumberTable = new LineNumber[lineNumberTableLength];

        for (int i = 0; i < lineNumberTableLength; i++) {
            lineNumberTable[i] = lineNumber.read(input);
        }
        return new LineNumberTableAttribute(lineNumberTable);
    }
}
