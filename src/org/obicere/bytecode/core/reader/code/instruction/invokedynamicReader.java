package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.InvokeDynamic;
import org.javacore.common.BootstrapMethodLink;
import org.javacore.constant.ConstantInvokeDynamic;
import org.obicere.bytecode.core.objects.code.instruction.DefaultInvokeDynamic;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class InvokeDynamicReader implements Reader<InvokeDynamic> {

    @Override
    public InvokeDynamic read(final ByteCodeReader input) throws IOException {
        final ConstantInvokeDynamic callSite = input.readConstant();
        final BootstrapMethodLink link = callSite.getInvocation();

        final int byte3 = input.readUnsignedByte();
        final int byte4 = input.readUnsignedByte();

        return new DefaultInvokeDynamic(link, byte3, byte4);
    }
}