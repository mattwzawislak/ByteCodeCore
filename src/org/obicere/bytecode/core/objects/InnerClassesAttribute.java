package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class InnerClassesAttribute extends Attribute {

    public static final String IDENTIFIER = "InnerClassesAttribute";

    private final InnerClass[] classes;

    public InnerClassesAttribute(final int length, final InnerClass[] classes) {
        super(length);
        if (classes == null) {
            throw new NullPointerException("inner classes must be non-null");
        }

        this.classes = classes;
    }

    public InnerClass[] getInnerClasses() {
        return classes;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
