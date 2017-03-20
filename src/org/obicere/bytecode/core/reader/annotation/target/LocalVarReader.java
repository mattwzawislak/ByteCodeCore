package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.Identifier;
import org.javacore.annotation.target.LocalVar;
import org.javacore.code.Code;
import org.javacore.code.block.label.Label;
import org.obicere.bytecode.core.objects.annotation.target.DefaultLocalVar;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVarReader implements Reader<LocalVar> {
    @Override
    public LocalVar read(final ByteCodeReader input) throws IOException {
        final Code code = (Code) input.getParent(Identifier.CODE);

        final int startPC = input.readUnsignedShort();
        final Label start = code.getLabel(startPC);
        final Label end = code.getLabel(startPC + input.readUnsignedShort());
        final int index = input.readUnsignedShort();

        return new DefaultLocalVar(start, end, index);
    }
}
