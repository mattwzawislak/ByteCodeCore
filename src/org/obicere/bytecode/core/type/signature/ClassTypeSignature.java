package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class ClassTypeSignature implements ReferenceTypeSignature, ThrowsSignature {

    private final String                     packageSpecifier;
    private final SimpleClassTypeSignature   signature;
    private final SimpleClassTypeSignature[] suffixes;

    public ClassTypeSignature(final String packageSpecifier, final SimpleClassTypeSignature signature, final SimpleClassTypeSignature[] suffixes) {
        this.packageSpecifier = packageSpecifier;
        this.signature = signature;
        this.suffixes = suffixes;
    }

    public String getPackage() {
        return packageSpecifier;
    }

    public SimpleClassTypeSignature getSignature() {
        return signature;
    }

    public SimpleClassTypeSignature[] getSuffixes() {
        return suffixes;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createClassType(this);
    }
}
