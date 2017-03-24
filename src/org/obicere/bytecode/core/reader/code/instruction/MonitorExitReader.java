package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.MonitorExit;
import org.obicere.bytecode.core.objects.code.instruction.DefaultMonitorExit;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MonitorExitReader implements Reader<MonitorExit> {

    @Override
    public MonitorExit read(final ByteCodeReader input) throws IOException {
        return DefaultMonitorExit.INSTANCE;
    }
}