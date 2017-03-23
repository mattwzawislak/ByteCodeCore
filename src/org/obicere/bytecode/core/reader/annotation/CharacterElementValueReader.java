package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.CharacterElementValue;
import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.objects.annotation.DefaultCharacterElementValue;
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
        return new DefaultCharacterElementValue((char) value.getValue());
    }
}
