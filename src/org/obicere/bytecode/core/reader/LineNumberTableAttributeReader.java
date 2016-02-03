package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LineNumber;
import org.obicere.bytecode.core.objects.LineNumberTableAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberTableAttributeReader implements Reader<LineNumberTableAttribute> {

    private final LineNumberReader lineNumber = new LineNumberReader();

    @Override
    public LineNumberTableAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int lineNumberTableLength = input.readUnsignedShort();
        final LineNumber[] lineNumberTable = new LineNumber[lineNumberTableLength];

        for(int i = 0; i < lineNumberTableLength; i++){
            lineNumberTable[i] = lineNumber.read(input);
        }
        return new LineNumberTableAttribute(length, lineNumberTable);
    }
}
