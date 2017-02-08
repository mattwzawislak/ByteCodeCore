package org.obicere.bytecode.core.objects.annotation.path;

import org.javacore.annotation.path.Path;
import org.javacore.annotation.path.PathKind;

/**
 * @author Obicere
 */
public class DefaultPath implements Path {

    private final PathKind kind;

    private final int argumentIndex;

    public DefaultPath(final PathKind kind, final int argumentIndex) {
        if(kind == null) {
            throw new NullPointerException("kind must be non-null.");
        }
        this.kind = kind;
        this.argumentIndex = argumentIndex;
    }

    @Override
    public PathKind getKind() {
        return kind;
    }

    @Override
    public int getArgumentIndex() {
        return argumentIndex;
    }

}
