package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.CharacterElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CharacterElementValueReader implements Reader<CharacterElementValue> {
    @Override
    public CharacterElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantInteger value = input.readConstant();
        return new CharacterElementValue((char) value.getBytes());
    }
}
