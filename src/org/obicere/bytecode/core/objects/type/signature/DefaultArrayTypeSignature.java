package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.ArrayTypeSignature;
import org.javacore.type.signature.JavaTypeSignature;

/**
 * @author Obicere
 */
public class DefaultArrayTypeSignature implements ArrayTypeSignature {

    private JavaTypeSignature signature;

    public DefaultArrayTypeSignature(final JavaTypeSignature signature) {
        this.signature = signature;
    }

    public JavaTypeSignature getSignature() {
        return signature;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createArrayType(signature);
    }
}
