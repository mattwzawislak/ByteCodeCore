package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultMonitorExit;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class monitorexitReader implements Reader<DefaultMonitorExit> {

    @Override
    public DefaultMonitorExit read(final ByteCodeReader input) throws IOException {
        return DefaultMonitorExit.INSTANCE;
    }
}