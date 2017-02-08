package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.LineNumberTableAttribute;
import org.javacore.code.LineNumber;

/**
 * @author Obicere
 */
public class DefaultLineNumberTableAttribute extends AbstractAttribute implements LineNumberTableAttribute {

    private final LineNumber[] lineNumberTable;

    public DefaultLineNumberTableAttribute(final LineNumber[] lineNumberTable) {
        super("LineNumberTableAttribute");
        if (lineNumberTable == null) {
            throw new NullPointerException("line number table must be non-null");
        }

        this.lineNumberTable = lineNumberTable;
    }

    @Override
    public LineNumber[] getTable() {
        return lineNumberTable;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
