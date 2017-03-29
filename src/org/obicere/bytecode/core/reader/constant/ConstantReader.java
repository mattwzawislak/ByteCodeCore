package org.obicere.bytecode.core.reader.constant;

import org.javacore.Identifier;
import org.javacore.constant.Constant;
import org.javacore.constant.Constants;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantReader implements Reader<Constant> {

    @Override
    public Constant read(final ByteCodeReader input) throws IOException {
        final int next = input.readUnsignedByte();
        final Identifier identifier = Constants.of(next);
        if (identifier == null) {
            throw new ClassFormatError("Invalid constant tag: " + next);
        }
        return input.read(identifier);
    }
}
