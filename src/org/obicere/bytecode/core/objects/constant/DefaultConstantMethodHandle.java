package org.obicere.bytecode.core.objects.constant;

import org.javacore.common.MethodHandle;
import org.javacore.constant.ConstantMethodHandle;
import org.javacore.constant.ConstantPool;
import org.javacore.constant.ConstantRef;
import org.javacore.reference.Reference;
import org.javacore.reference.ReferenceKind;
import org.obicere.bytecode.core.objects.common.DefaultMethodHandle;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantMethodHandle extends AbstractConstant implements ConstantMethodHandle {

    private final int referenceIndex;

    private final ReferenceKind referenceKind;

    private volatile MethodHandle<?> handle;

    public DefaultConstantMethodHandle(final ConstantPool constantPool, final int referenceKind, final int referenceIndex) {
        super(constantPool, ConstantReader.CONSTANT_METHOD_HANDLE);
        this.referenceKind = ReferenceKind.get(referenceKind);
        this.referenceIndex = referenceIndex;
    }

    @Override
    public MethodHandle<?> getHandle() {
        if (handle == null) {
            final ConstantRef constant = (ConstantRef) constantPool.get(referenceIndex);
            final Reference<?> reference = constant.getReference();

            this.handle = new DefaultMethodHandle<>(referenceKind, reference);
        }

        return handle;
    }
}
