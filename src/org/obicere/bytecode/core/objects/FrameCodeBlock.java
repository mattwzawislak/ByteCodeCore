package org.obicere.bytecode.core.objects;

/**
 */
public class FrameCodeBlock extends CodeBlock {

    public static final String IDENTIFIER = "FrameCodeBlock";

    private final StackMapFrame frame;

    private final int startPC;

    public FrameCodeBlock(final StackMapFrame frame, final int startPC) {
        this.frame = frame;
        this.startPC = startPC;
    }

    @Override
    public int getStartPC() {
        return startPC;
    }

    @Override
    public String getName() {
        return "F" + startPC;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
    /*
    @Override
    public void model(final DocumentBuilder builder) {
        builder.newLine();
        frame.model(builder);
    }
    */
}
