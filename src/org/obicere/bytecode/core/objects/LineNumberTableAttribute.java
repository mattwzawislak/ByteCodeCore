package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class LineNumberTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LineNumberTableAttribute";

    private final LineNumber[] lineNumberTable;

    public LineNumberTableAttribute(final int length, final LineNumber[] lineNumberTable) {
        super(length);
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
