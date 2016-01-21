package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SourceFileAttribute extends Attribute {

    public static final String IDENTIFIER = "SourceFileAttribute";

    private final int sourceFileIndex;

    public SourceFileAttribute(final int length, final int sourceFileIndex) {
        super(length);

        this.sourceFileIndex = sourceFileIndex;
    }

    public int getSourceFileIndex() {
        return sourceFileIndex;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
