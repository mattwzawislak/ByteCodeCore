package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.MonitorEnter;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultMonitorEnter extends AbstractInstruction implements MonitorEnter {

    public static final String MNEMONIC = "monitorenter";

    public static final MonitorEnter INSTANCE = new DefaultMonitorEnter();

    private DefaultMonitorEnter() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_MONITORENTER;
    }
}
