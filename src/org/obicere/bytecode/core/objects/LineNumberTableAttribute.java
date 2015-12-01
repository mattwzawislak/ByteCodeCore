package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class LineNumberTableAttribute extends Attribute {

    private final LineNumber[] lineNumberTable;

    public LineNumberTableAttribute(final LineNumber[] lineNumberTable) {

        if (lineNumberTable == null) {
            throw new NullPointerException("line number table not defined.");
        }

        this.lineNumberTable = lineNumberTable;
    }

    public LineNumber[] getLineNumberTable() {
        return lineNumberTable;
    }
}
