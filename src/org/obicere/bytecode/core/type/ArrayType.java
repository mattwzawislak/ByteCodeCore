package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class ArrayType implements Type {

    private final Type component;

    ArrayType(final Type component) {
        this.component = component;
    }

    @Override
    public String getDescriptor() {
        final String componentDescriptor = component.getDescriptor();
        if (componentDescriptor == null) {
            return null;
        } else {
            return "[" + componentDescriptor;
        }
    }

    @Override
    public String getName() {
        final String componentName = component.getName();
        if (componentName == null) {
            return null;
        } else {
            return componentName + "[]";
        }
    }

    @Override
    public String getSimpleName() {
        final String componentName = component.getSimpleName();
        if (componentName == null) {
            return null;
        } else {
            return componentName + "[]";
        }
    }

    @Override
    public String getCanonicalName() {
        final String componentName = component.getCanonicalName();
        if (componentName == null) {
            return null;
        } else {
            return componentName + "[]";
        }
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }

    @Override
    public boolean isGeneric() {
        return component.isGeneric();
    }

    @Override
    public boolean isArray() {
        return true;
    }
}
