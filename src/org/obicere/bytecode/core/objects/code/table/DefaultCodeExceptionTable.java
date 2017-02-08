package org.obicere.bytecode.core.objects.code.table;

import org.javacore.code.CodeException;
import org.javacore.code.table.CodeExceptionTable;

/**
 */
public class DefaultCodeExceptionTable implements CodeExceptionTable {

    public static final DefaultCodeExceptionTable EMPTY = new DefaultCodeExceptionTable(new CodeException[0]);

    private final CodeException[] exceptions;

    public DefaultCodeExceptionTable(final CodeException[] exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public CodeException[] getCodeExceptions() {
        return exceptions;
    }
}
