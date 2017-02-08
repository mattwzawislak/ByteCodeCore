package org.obicere.bytecode.core.objects.attribute;

import org.javacore.JCClass;
import org.javacore.attribute.ExceptionsAttribute;
import org.obicere.bytecode.core.objects.DefaultJCClass;

/**
 * @author Obicere
 */
public class DefaultExceptionsAttribute extends AbstractAttribute implements ExceptionsAttribute {

    private final JCClass[] exceptions;

    public DefaultExceptionsAttribute(final DefaultJCClass[] exceptions) {
        super("ExceptionsAttribute");
        if (exceptions == null) {
            throw new NullPointerException("exceptions must be non-null");
        }
        this.exceptions = exceptions;
    }

    @Override
    public int getNumberOfExceptions() {
        return exceptions.length;
    }

    @Override
    public JCClass[] getExceptions() {
        return exceptions;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
