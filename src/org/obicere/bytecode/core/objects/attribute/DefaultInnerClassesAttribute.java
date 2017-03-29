package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.InnerClassesAttribute;
import org.javacore.common.InnerClass;

/**
 * @author Obicere
 */
public class DefaultInnerClassesAttribute extends AbstractAttribute implements InnerClassesAttribute {

    private final InnerClass[] classes;

    public DefaultInnerClassesAttribute(final InnerClass[] classes) {
        super(Attributes.INNER_CLASSES_ATTRIBUTE_NAME);
        if (classes == null) {
            throw new NullPointerException("inner classes must be non-null");
        }

        this.classes = classes;
    }

    @Override
    public int getNumberOfClasses() {
        return classes.length;
    }

    @Override
    public InnerClass[] getClasses() {
        return classes;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
