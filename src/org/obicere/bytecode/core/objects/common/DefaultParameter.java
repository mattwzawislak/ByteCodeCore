package org.obicere.bytecode.core.objects.common;

import org.javacore.common.Parameter;

/**
 * @author Obicere
 */
public class DefaultParameter implements Parameter {

    private final String name;
    private final int    accessFlags;

    public DefaultParameter(final String name, final int accessFlags) {
        this.name = name;
        this.accessFlags = accessFlags;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAccessFlags() {
        return accessFlags;
    }

}
