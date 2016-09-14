package org.obicere.bytecode.core.objects.code.block.label;

/**
 * @author Obicere
 */
public class StartLabel implements Label {

    public static final String IDENTIFIER = "StartLabel";

    @Override
    public int computeOffset(final LabelFactory factory) {
        return 0;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
