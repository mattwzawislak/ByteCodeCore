package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.MonitorExit;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultMonitorExit extends AbstractInstruction implements MonitorExit {

    public static final String MNEMONIC = "monitorexit";

    public static final MonitorExit INSTANCE = new DefaultMonitorExit();

    private DefaultMonitorExit() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_MONITOREXIT;
    }
}
