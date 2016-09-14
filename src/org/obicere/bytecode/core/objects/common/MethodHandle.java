package org.obicere.bytecode.core.objects.common;

import org.obicere.bytecode.core.objects.reference.Reference;
import org.obicere.bytecode.core.objects.reference.ReferenceKind;

/**
 * @author Obicere
 */
public class MethodHandle<R> {

    private final ReferenceKind kind;

    private final Reference<R> reference;

    public MethodHandle(final ReferenceKind kind, final Reference<R> reference) {
        this.kind = kind;
        this.reference = reference;
    }

    public ReferenceKind getReferenceKind() {
        return kind;
    }

    public Reference<R> getReference() {
        return reference;
    }

}
