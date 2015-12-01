package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SourceFileAttribute extends Attribute {

    private final int sourceFileIndex;

    public SourceFileAttribute(final int sourceFileIndex) {
        this.sourceFileIndex = sourceFileIndex;
    }

    public int getSourceFileIndex() {
        return sourceFileIndex;
    }
}
