package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.Identifier;
import org.javacore.code.instruction.Instruction;
import org.javacore.code.instruction.Instructions;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InstructionReader implements Reader<Instruction> {

    @Override
    public Instruction read(final ByteCodeReader input) throws IOException {
        final int next = input.peek();
        final Identifier identifier = Instructions.of(next);

        if (identifier == null) {
            throw new ClassFormatError("Unrecognized instruction: " + Integer.toHexString(0xFF & next));
        }

        return input.read(identifier);
    }
}
