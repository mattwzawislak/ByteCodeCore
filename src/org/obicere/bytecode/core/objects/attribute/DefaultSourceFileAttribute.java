package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.SourceFileAttribute;

/**
 * @author Obicere
 */
public class DefaultSourceFileAttribute extends AbstractAttribute implements SourceFileAttribute {

    private final String sourceFile;

    public DefaultSourceFileAttribute(final String sourceFile) {
        super("SourceFileAttribute");
        this.sourceFile = sourceFile;
    }

    @Override
    public String getSourceFile() {
        return sourceFile;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
