package org.obicere.bytecode.core.objects.type;

import org.javacore.type.ArrayType;
import org.javacore.type.Type;

/**
 * @author Obicere
 */
public final class DefaultArrayType implements ArrayType {

    private final Type component;

    DefaultArrayType(final Type component) {
        this.component = component;
    }

    public Type getComponentType() {
        return component;
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
