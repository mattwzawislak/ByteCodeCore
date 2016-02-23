package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.ByteCodeElement;

/**
 */
public class ClassTypeSignatureSuffix extends ByteCodeElement {

    public static final String IDENTIFIER = "ClassTypeSignatureSuffix";

    private final SimpleClassTypeSignature simpleClassTypeSignature;

    private ClassTypeSignatureSuffix(final SimpleClassTypeSignature simpleClassTypeSignature) {
        this.simpleClassTypeSignature = simpleClassTypeSignature;
    }

    public SimpleClassTypeSignature getSimpleClassTypeSignature() {
        return simpleClassTypeSignature;
    }

    public static ClassTypeSignatureSuffix parse(final QueueString string) {
        if (!string.hasNext() || string.next() != '.') {
            return null;
        }
        final SimpleClassTypeSignature simpleClassTypeSignature = SimpleClassTypeSignature.parse(string);
        if (simpleClassTypeSignature == null) {
            return null;
        }
        return new ClassTypeSignatureSuffix(simpleClassTypeSignature);
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
