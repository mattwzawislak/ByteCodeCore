package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class SourceFileAttribute extends Attribute {

    public static final String IDENTIFIER = "SourceFileAttribute";

    private final String sourceFile;

    public SourceFileAttribute(final String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
