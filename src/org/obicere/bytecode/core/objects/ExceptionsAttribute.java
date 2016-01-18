package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ExceptionsAttribute extends Attribute {

    public static final String IDENTIFIER = "ExceptionsAttribute";

    private final int[] indexTable;

    public ExceptionsAttribute(final int length, final int[] indexTable) {
        super(length);
        if (indexTable == null) {
            throw new NullPointerException("index table must be non-null");
        }
        this.indexTable = indexTable;
    }

    public int[] getIndexTable() {
        return indexTable;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
