package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamic extends Constant {

    public static final String IDENTIFIER = "ConstantInvokeDynamic";

    private static final String NAME = "InvokeDynamic";

    private final int bootstrapMethodAttrIndex;

    private final int nameAndTypeIndex;

    public ConstantInvokeDynamic(final int bootstrapMethodAttrIndex, final int nameAndTypeIndex) {
        super(ConstantReader.CONSTANT_INVOKE_DYNAMIC);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(nameAndTypeIndex) + " " + bootstrapMethodAttrIndex;
    }

    public String getIdentifier(){
        return IDENTIFIER;
    }
}
