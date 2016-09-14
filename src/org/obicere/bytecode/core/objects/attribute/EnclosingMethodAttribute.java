package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.Method;

/**
 * @author Obicere
 */
public class EnclosingMethodAttribute extends Attribute {

    public static final String IDENTIFIER = "EnclosingMethodAttribute";

    private final Class  enclosingClass;
    private final Method enclosingMethod;

    public EnclosingMethodAttribute(final Class enclosingClass, final Method enclosingMethod) {
        if (enclosingClass == null) {
            throw new NullPointerException("enclosing class must be non-null");
        }
        this.enclosingClass = enclosingClass;
        this.enclosingMethod = enclosingMethod;
    }

    public Class getEnclosingClass() {
        return enclosingClass;
    }

    public Method getEnclosingMethod() {
        return enclosingMethod;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

}
