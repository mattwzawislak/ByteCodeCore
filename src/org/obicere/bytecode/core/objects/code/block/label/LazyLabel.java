package org.obicere.bytecode.core.objects.code.block.label;

/**
 * @author Obicere
 */
public class LazyLabel implements Label {

    public static final String IDENTIFIER = "LazyLabel";

    private Label initialized;

    private final int value;

    public LazyLabel(final int value) {
        this.value = value;
    }

    public boolean isInitialized() {
        return initialized != null;
    }

    public Label initialize(final LabelFactory factory){
        final Label initialized = factory.getLabel(value, 0);

        this.initialized = initialized;

        return initialized;
    }

    public Label get() {
        if(!isInitialized()) {
            throw new IllegalStateException("lazy label has not be initialized.");
        }
        return initialized;
    }

    @Override
    public int computeOffset(final LabelFactory factory) {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
