package org.obicere.bytecode.core.objects.reference;

/**
 * @author Obicere
 */
public abstract class AbstractReference<R> implements Reference<R> {

    private final String containingClass;

    private final String name;

    private final String descriptor;

    public AbstractReference(final String containingClass, final String name, final String descriptor) {
        this.containingClass = containingClass;
        this.name = name;
        this.descriptor = descriptor;
    }

    public String getContainingClass() {
        return containingClass;
    }

    public String getName() {
        return name;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
