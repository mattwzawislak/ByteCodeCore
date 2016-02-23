package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.ByteCodeElement;
import org.obicere.bytecode.core.objects.Parameter;

import java.util.LinkedList;

/**
 */
public class Parameters extends ByteCodeElement {

    public static final String IDENTIFIER = "Parameters";

    private final JavaTypeSignature[] signatures;

    private Parameter[] parameters;

    public Parameters(final JavaTypeSignature[] signatures) {
        this.signatures = signatures;
    }

    public static Parameters parse(final QueueString string) {
        if (string.next() != '(') {
            return null;
        }
        if (!string.hasNext(')')) {
            return null;
        }
        final LinkedList<JavaTypeSignature> javaTypeSignatureList = new LinkedList<>();
        while (string.peek() != ')') {
            final JavaTypeSignature javaTypeSignature = JavaTypeSignature.parse(string);
            if (javaTypeSignature == null) {
                return null;
            }
            javaTypeSignatureList.add(javaTypeSignature);
        }
        final JavaTypeSignature[] javaTypeSignatures = javaTypeSignatureList.toArray(new JavaTypeSignature[javaTypeSignatureList.size()]);

        // consume the ')'
        string.next();
        return new Parameters(javaTypeSignatures);
    }

    public JavaTypeSignature[] getSignatures() {
        return signatures;
    }

    public Parameter[] getParameters(){
        return parameters;
    }

    public void setParameters(final Parameter[] parameters){
        if(parameters.length != signatures.length){
            throw new IllegalArgumentException("number of parameters must match the number of signatures.");
        }
        this.parameters = parameters;
    }

    public void addAnnotations(final Annotation[][] annotations) {
        for (int i = 0; i < annotations.length; i++) {
            for (final Annotation annotation : annotations[i]) {
                signatures[i].add(annotation);
            }
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
