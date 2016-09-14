package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.common.MethodHandle;
import org.obicere.bytecode.core.objects.reference.Reference;
import org.obicere.bytecode.core.objects.reference.ReferenceKind;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantMethodHandle extends Constant {

    private final int referenceIndex;

    private final ReferenceKind referenceKind;

    private volatile MethodHandle<?> handle;

    public ConstantMethodHandle(final ConstantPool constantPool, final int referenceKind, final int referenceIndex) {
        super(constantPool, ConstantReader.CONSTANT_METHOD_HANDLE);
        this.referenceKind = ReferenceKind.get(referenceKind);
        this.referenceIndex = referenceIndex;
    }

    @SuppressWarnings("unchecked")
    public <R> MethodHandle<R> getHandle() {
        if (handle == null) {
            final ConstantRef<?> constant = constantPool.get(referenceIndex);
            final Reference<?> reference = constant.getReference();

            this.handle = new MethodHandle<>(referenceKind, reference);
        }

        return (MethodHandle<R>) handle;
    }

    @Override
    public String toString() {
        return referenceKind + ";" + constantPool.getAsString(referenceIndex);
    }
}
