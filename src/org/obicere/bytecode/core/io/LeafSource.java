package org.obicere.bytecode.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Obicere
 */
public interface LeafSource extends Source {

    public InputStream getInputStream() throws IOException;

    public OutputStream getOutputStream() throws IOException;

    public byte[] read() throws IOException;

    public boolean write(final byte[] bytes) throws IOException;

}
