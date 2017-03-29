package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.LineNumberTableAttribute;
import org.javacore.code.LineNumber;
import org.obicere.bytecode.core.objects.attribute.DefaultLineNumberTableAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LineNumberTableAttributeReader implements Reader<LineNumberTableAttribute> {

    @Override
    public LineNumberTableAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final int lineNumberTableLength = input.readUnsignedShort();
        final LineNumber[] lineNumberTable = new LineNumber[lineNumberTableLength];

        for (int i = 0; i < lineNumberTableLength; i++) {
            lineNumberTable[i] = input.read(Identifier.LINE_NUMBER);
        }
        return new DefaultLineNumberTableAttribute(lineNumberTable);
    }
}
