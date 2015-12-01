package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.CharacterElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CharacterElementValueReader implements Reader<CharacterElementValue> {
    @Override
    public CharacterElementValue read(final IndexedDataInputStream input) throws IOException {
        return new CharacterElementValue(input.readUnsignedShort());
    }
}
