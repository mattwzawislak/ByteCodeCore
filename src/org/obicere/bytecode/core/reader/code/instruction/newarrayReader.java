package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.JavaCore;
import org.javacore.code.instruction.NewArray;
import org.javacore.type.Type;
import org.obicere.bytecode.core.objects.code.instruction.DefaultNewArray;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class NewArrayReader implements Reader<NewArray> {

    @Override
    public NewArray read(final ByteCodeReader input) throws IOException {
        final Type type = getType(input.readUnsignedByte());
        return new DefaultNewArray(type);
    }

    private Type getType(final int atype) {
        final String name;
        switch (atype) {
            case 4:
                name = "boolean";
                break;
            case 5:
                name = "char";
                break;
            case 6:
                name = "float";
                break;
            case 7:
                name = "double";
                break;
            case 8:
                name = "byte";
                break;
            case 9:
                name = "short";
                break;
            case 10:
                name = "int";
                break;
            case 11:
                name = "long";
                break;
            default:
                throw new ClassFormatError("Unexpected value for atype: " + atype);
        }

        return JavaCore.getType(name);
    }
}