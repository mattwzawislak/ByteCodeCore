package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.ObjectVariableInfo;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class ObjectVariableInfoReader implements Reader<ObjectVariableInfo> {
    @Override
    public ObjectVariableInfo read(final ByteCodeReader input) throws IOException {
        final ConstantClass constantClass = input.readConstant();
        final Type type = Type.of(constantClass.getName());
        return new ObjectVariableInfo(type);
    }
}
