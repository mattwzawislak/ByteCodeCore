package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.Class;

/**
 * @author Obicere
 */
public class ExceptionsAttribute extends Attribute {

    public static final String IDENTIFIER = "ExceptionsAttribute";

    private final Class[] exceptions;

    public ExceptionsAttribute(final Class[] exceptions) {
        if (exceptions == null) {
            throw new NullPointerException("exceptions must be non-null");
        }
        this.exceptions = exceptions;
    }

    public Class[] getExceptions() {
        return exceptions;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
