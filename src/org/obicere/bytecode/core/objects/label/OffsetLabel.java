package org.obicere.bytecode.core.objects.label;

/**
 * @author Obicere
 */
public class OffsetLabel implements Label {

    public static final String IDENTIFIER = "OffsetLabel";

    private final int offset;

    public OffsetLabel(final int offset) {
        this.offset = offset;
    }

    public int getOffset(){
        return offset;
    }

    @Override
    public int computeOffset(final LabelFactory factory) {
        return offset;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
