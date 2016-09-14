package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.reference.ReferenceProvider;

/**
 * @author Obicere
 */
public abstract class ConstantRef<R> extends Constant implements ReferenceProvider<R> {

    public ConstantRef(final ConstantPool constantPool, final int tag) {
        super(constantPool, tag);
    }

}
