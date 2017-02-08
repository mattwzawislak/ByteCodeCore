package org.obicere.bytecode.core.objects.common;

import org.javacore.common.MethodHandle;
import org.javacore.reference.Reference;
import org.javacore.reference.ReferenceKind;

/**
 * @author Obicere
 */
public class DefaultMethodHandle<R> implements MethodHandle<R> {

    private final ReferenceKind kind;

    private final Reference<R> reference;

    public DefaultMethodHandle(final ReferenceKind kind, final Reference<R> reference) {
        this.kind = kind;
        this.reference = reference;
    }

    @Override
    public ReferenceKind getReferenceKind() {
        return kind;
    }

    @Override
    public Reference<R> getReference() {
        return reference;
    }

}
