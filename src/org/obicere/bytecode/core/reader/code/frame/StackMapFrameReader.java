package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.StackMapFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StackMapFrameReader implements Reader<StackMapFrame> {

    //JVMS (§4.7.4)
    private static final int MAXIMUM_SAME                              = 63;
    private static final int MAXIMUM_SAME_LOCALS_1_STACK_ITEM          = 127;
    private static final int MAXIMUM_UNUSED                            = 246;
    private static final int MAXIMUM_SAME_LOCALS_1_STACK_ITEM_EXTENDED = 247;
    private static final int MAXIMUM_CHOP                              = 250;
    private static final int MAXIMUM_SAME_EXTENDED                     = 251;
    private static final int MAXIMUM_APPEND                            = 254;
    private static final int MAXIMUM_FULL                              = 255;

    @Override
    public StackMapFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.peek();
        if (frameType <= MAXIMUM_SAME) {
            return input.read(Identifier.SAME_FRAME);
        } else if (frameType <= MAXIMUM_SAME_LOCALS_1_STACK_ITEM) {
            return input.read(Identifier.SAME_LOCALS_1_STACK_ITEM_FRAME);
        } else if (frameType <= MAXIMUM_UNUSED) {
            throw new ClassFormatError("reached a reserved frame type.");
        } else if (frameType <= MAXIMUM_SAME_LOCALS_1_STACK_ITEM_EXTENDED) {
            return input.read(Identifier.SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED);
        } else if (frameType <= MAXIMUM_CHOP) {
            return input.read(Identifier.CHOP_FRAME);
        } else if (frameType <= MAXIMUM_SAME_EXTENDED) {
            return input.read(Identifier.SAME_FRAME_EXTENDED);
        } else if (frameType <= MAXIMUM_APPEND) {
            return input.read(Identifier.APPEND_FRAME);
        } else if (frameType <= MAXIMUM_FULL) {
            return input.read(Identifier.FULL_FRAME);
        } else {
            throw new AssertionError("if reached, data input stream read byte failed.");
        }
    }
}
