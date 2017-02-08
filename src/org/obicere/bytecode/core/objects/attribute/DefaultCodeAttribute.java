package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.CodeAttribute;
import org.javacore.code.Code;
import org.javacore.code.table.CodeExceptionTable;
import org.obicere.bytecode.core.objects.code.DefaultCode;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DefaultCodeAttribute extends AbstractAttribute implements CodeAttribute {

    private final Code code;

    public DefaultCodeAttribute(final ByteCodeReader reader) throws IOException {
        super("Code");
        // TODO this needs a lot of work
        this.code = new DefaultCode(reader);
    }

    @Override
    public int getMaxStack() {
        return 0;
    }

    @Override
    public int getMaxLocals() {
        return 0;
    }

    @Override
    public int getCodeLength() {
        return 0;
    }

    @Override
    public Code getCode() {
        return code;
    }

    @Override
    public int getExceptionTableLength() {
        return 0;
    }

    @Override
    public CodeExceptionTable getExceptionTable() {
        return null;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
