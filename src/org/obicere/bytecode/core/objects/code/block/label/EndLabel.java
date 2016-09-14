package org.obicere.bytecode.core.objects.code.block.label;

/**
 * @author Obicere
 */
public class EndLabel implements Label {

    public static final String IDENTIFIER = "EndLabel";

    @Override
    public int computeOffset(final LabelFactory factory) {
        return factory.getCodeSize();
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
