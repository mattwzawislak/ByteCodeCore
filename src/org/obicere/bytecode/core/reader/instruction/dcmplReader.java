package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dcmpl;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmplReader implements Reader<dcmpl> {

    @Override
    public dcmpl read(final IndexedDataInputStream input) throws IOException {
        return new dcmpl();
    }
}