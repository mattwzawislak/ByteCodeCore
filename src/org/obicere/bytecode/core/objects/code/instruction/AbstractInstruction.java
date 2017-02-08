package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Instruction;

/**
 * @author Obicere
 */
public abstract class AbstractInstruction implements Instruction {

    // by default, most instructions are single-byte, so this is default
    @Override
    public int getLength() {
        return 1;
    }

}
