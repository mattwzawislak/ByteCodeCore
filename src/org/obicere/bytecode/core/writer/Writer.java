package org.obicere.bytecode.core.writer;

import org.obicere.bytecode.core.util.IndexedDataOutputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public interface Writer<T> {

    public void write(final T element, final IndexedDataOutputStream out) throws IOException;

}
