package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.ClassTypeSignature;
import org.javacore.type.signature.SimpleClassTypeSignature;

/**
 * @author Obicere
 */
public class DefaultClassTypeSignature implements ClassTypeSignature {

    private final String                     packageSpecifier;
    private final SimpleClassTypeSignature   signature;
    private final SimpleClassTypeSignature[] suffixes;

    public DefaultClassTypeSignature(final String packageSpecifier, final SimpleClassTypeSignature signature, final SimpleClassTypeSignature[] suffixes) {
        this.packageSpecifier = packageSpecifier;
        this.signature = signature;
        this.suffixes = suffixes;
    }

    @Override
    public String getPackage() {
        return packageSpecifier;
    }

    @Override
    public SimpleClassTypeSignature getSignature() {
        return signature;
    }

    @Override
    public SimpleClassTypeSignature[] getSuffixes() {
        return suffixes;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createClassType(this);
    }
}
