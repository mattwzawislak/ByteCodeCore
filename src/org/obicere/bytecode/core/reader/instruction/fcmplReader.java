package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fcmpl;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fcmplReader implements Reader<fcmpl> {

    @Override
    public fcmpl read(final IndexedDataInputStream input) throws IOException {
        return fcmpl.INSTANCE;
    }
}