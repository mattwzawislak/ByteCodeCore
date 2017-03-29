package org.obicere.bytecode.core.objects.attribute;

import org.javacore.JCClass;
import org.javacore.JCMethod;
import org.javacore.attribute.Attributes;
import org.javacore.attribute.EnclosingMethodAttribute;

/**
 * @author Obicere
 */
public class DefaultEnclosingMethodAttribute extends AbstractAttribute implements EnclosingMethodAttribute {

    private final JCClass  enclosingClass;
    private final JCMethod enclosingMethod;

    public DefaultEnclosingMethodAttribute(final JCClass enclosingClass, final JCMethod enclosingMethod) {
        super(Attributes.ENCLOSING_METHOD_ATTRIBUTE_NAME);
        if (enclosingClass == null) {
            throw new NullPointerException("enclosing class must be non-null");
        }
        this.enclosingClass = enclosingClass;
        this.enclosingMethod = enclosingMethod;
    }

    @Override
    public JCClass getEnclosingClass() {
        return enclosingClass;
    }

    @Override
    public JCMethod getEnclosingMethod() {
        return enclosingMethod;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
