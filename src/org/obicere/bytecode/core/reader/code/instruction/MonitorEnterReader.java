package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.MonitorEnter;
import org.obicere.bytecode.core.objects.code.instruction.DefaultMonitorEnter;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MonitorEnterReader implements Reader<MonitorEnter> {

    @Override
    public MonitorEnter read(final ByteCodeReader input) throws IOException {
        return DefaultMonitorEnter.INSTANCE;
    }
}