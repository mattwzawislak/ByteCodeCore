package org.obicere.bytecode.core.reader.annotation.target;

import org.obicere.bytecode.core.objects.annotation.target.LocalVar;
import org.javacore.code.block.label.Label;
import org.javacore.code.block.label.LabelFactory;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVarReader implements Reader<LocalVar> {
    @Override
    public LocalVar read(final ByteCodeReader input) throws IOException {
        final LabelFactory factory = input.getLabelFactory();
        final int startPC = input.readUnsignedShort();
        final Label start = factory.getLabel(startPC, 0);
        final Label end = factory.getLabel(startPC, input.readUnsignedShort());
        final int index = input.readUnsignedShort();

        return new LocalVar(start, end, index);
    }
}
