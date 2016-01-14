package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantMethodHandle extends Constant {

    public static final String IDENTIFIER = "ConstantMethodHandle";

    private static final String NAME = "MethodHandle";

    private final int referenceKind;

    private final int referenceIndex;

    public ConstantMethodHandle(final int referenceKind, final int referenceIndex) {
        super(ConstantReader.CONSTANT_METHOD_HANDLE);
        this.referenceKind = referenceKind;
        this.referenceIndex = referenceIndex;
    }

    public int getReferenceKind() {
        return referenceKind;
    }

    public int getReferenceIndex() {
        return referenceIndex;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return referenceKind + ";" + constantPool.getAsString(referenceIndex);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
