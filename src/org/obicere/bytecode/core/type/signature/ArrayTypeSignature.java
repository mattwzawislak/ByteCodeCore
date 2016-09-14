package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class ArrayTypeSignature implements ReferenceTypeSignature {

    private JavaTypeSignature signature;

    public ArrayTypeSignature(final JavaTypeSignature signature){
        this.signature = signature;
    }

    public JavaTypeSignature getSignature(){
        return signature;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createArrayType(signature);
    }
}
