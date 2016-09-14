package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.code.block.LineNumber;

/**
 * @author Obicere
 */
public class LineNumberTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LineNumberTableAttribute";

    private final LineNumber[] lineNumberTable;

    public LineNumberTableAttribute(final LineNumber[] lineNumberTable) {
        if (lineNumberTable == null) {
            throw new NullPointerException("line number table must be non-null");
        }

        this.lineNumberTable = lineNumberTable;
    }

    public LineNumber[] getLineNumberTable() {
        return lineNumberTable;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
