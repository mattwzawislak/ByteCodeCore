package org.obicere.bytecode.core.util;

import java.io.DataOutputStream;
import java.io.OutputStream;

/**
 * @author Obicere
 */
public class IndexedDataOutputStream extends DataOutputStream {

    /**
     * Creates a new data output stream to write data to the specified
     * underlying output stream. The counter <code>written</code> is
     * set to zero.
     *
     * @param out the underlying output stream, to be saved for later
     *            use.
     * @see java.io.FilterOutputStream#out
     */
    public IndexedDataOutputStream(final OutputStream out) {
        super(out);
    }
}
