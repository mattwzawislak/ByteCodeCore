package org.obicere.bytecode.core.type.path;

import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public interface ClassPath {

    public static ClassPath getSystemClassPath() {
        return SystemClassPath.getInstance();
    }

    public Type find(final String name);

}
