package org.obicere.bytecode.core.reader.common;

import org.javacore.common.Parameter;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.common.DefaultParameter;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ParameterReader implements Reader<Parameter> {
    @Override
    public Parameter read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 nameConstant = input.readConstant();
        final int accessFlags = input.readUnsignedShort();

        final String name = nameConstant.getValue();

        return new DefaultParameter(name, accessFlags);
    }
}
