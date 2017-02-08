package org.obicere.bytecode.core.objects.type.path;

import org.javacore.type.Type;

/**
 * @author Obicere
 */
public interface ClassPath {

    public static ClassPath getSystemClassPath() {
        return SystemClassPath.getInstance();
    }

    public Type find(final String name);

}
