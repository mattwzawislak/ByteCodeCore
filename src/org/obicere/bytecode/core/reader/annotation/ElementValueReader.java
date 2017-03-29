package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.javacore.annotation.ElementValue;
import org.javacore.annotation.ElementValues;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ElementValueReader implements Reader<ElementValue> {

    @Override
    public ElementValue read(final ByteCodeReader input) throws IOException {
        final int tag = input.peek();
        final Identifier identifier = ElementValues.of(tag);
        if (identifier == null) {
            throw new IllegalStateException("no element value reader found for tag: " + tag);
        }
        return input.read(identifier);
    }
}
