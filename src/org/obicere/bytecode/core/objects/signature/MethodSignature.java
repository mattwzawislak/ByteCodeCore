package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.target.MethodFormalParameterTarget;
import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.target.ThrowsTarget;
import org.obicere.bytecode.core.objects.TypeAnnotation;
import org.obicere.bytecode.core.objects.target.TypeParameterBoundTarget;
import org.obicere.bytecode.core.objects.target.TypeParameterTarget;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 */
public class MethodSignature extends AnnotationTarget {

    public static final String IDENTIFIER = "MethodSignature";

    private final TypeParameters typeParameters;

    private final Parameters parameters;

    private final Result result;

    private final ThrowsSignatures throwsSignatures;

    private MethodSignature(final TypeParameters typeParameters, final Parameters parameters, final Result result, final ThrowsSignatures throwsSignatures) {
        this.typeParameters = typeParameters;
        this.parameters = parameters;
        this.result = result;
        this.throwsSignatures = throwsSignatures;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public Result getResult() {
        return result;
    }

    public ThrowsSignatures getThrowsSignatures() {
        return throwsSignatures;
    }

    public static MethodSignature parse(final String string){
        return parse(new QueueString(string));
    }

    public static MethodSignature parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final TypeParameters typeParameters = TypeParameters.parse(string);
        if (typeParameters == null) {
            return null;
        }

        final Parameters parameters = Parameters.parse(string);
        if (parameters == null) {
            return null;
        }

        final Result result = Result.parse(string);
        if (result == null) {
            return null;
        }

        final ThrowsSignatures throwsSignatures = ThrowsSignatures.parse(string);
        if (throwsSignatures == null) {
            return null;
        }

        return new MethodSignature(typeParameters, parameters, result, throwsSignatures);
    }

    public void addAnnotations(final TypeAnnotation[] annotations) {
        for (final TypeAnnotation annotation : annotations) {
            final List<Path> path = Arrays.asList(annotation.getTargetPath().getPath());
            walk(annotation, path.iterator());
        }
    }

    public void addAnnotations(final Annotation[][] annotations) {
        parameters.addAnnotations(annotations);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        final int targetType = annotation.getTargetType();
        switch (targetType) {
            case 0x01: // type_parameter_target
                walkTypeParameterTarget(annotation, path);
                return;
            case 0x12: // type_parameter_bound_target
                walkTypeParameterBoundTarget(annotation, path);
                return;
            case 0x14: // empty_target (return type)
                walkEmptyTargetReturn(annotation, path);
                return;
            case 0x15: // empty_target (receiver type)
                walkEmptyTargetReceiver(annotation, path);
                return;
            case 0x16: // formal_parameter_target
                walkFormalParameterTarget(annotation, path);
                return;
            case 0x17: // throws_target
                walkThrowsTarget(annotation, path);
                return;
            default:

        }
    }

    private void walkTypeParameterTarget(final TypeAnnotation annotation, final Iterator<Path> path) {
        final TypeParameterTarget target = (TypeParameterTarget) annotation.getTargetInfo();
        final TypeParameter[] types = typeParameters.getTypeParameters();
        types[target.getTypeParameterIndex()].walk(annotation, path);
    }

    private void walkTypeParameterBoundTarget(final TypeAnnotation annotation, final Iterator<Path> path) {
        final TypeParameterBoundTarget target = (TypeParameterBoundTarget) annotation.getTargetInfo();

        final int typeParameterIndex = target.getTypeParameterIndex();
        final int boundIndex = target.getBoundIndex();

        final TypeParameter[] types = typeParameters.getTypeParameters();
        final TypeParameter type = types[typeParameterIndex];

        final ClassBound classBound = type.getClassBound();
        final InterfaceBound[] interfaceBounds = type.getInterfaceBounds();

        final boolean hasClassBound = (classBound.getReferenceTypeSignature() != null);
        if (boundIndex == 0) {
            if (hasClassBound) {
                classBound.walk(annotation, path);
            } else {
                interfaceBounds[0].walk(annotation, path);
            }
        } else {
            final int fixedIndex;
            if (hasClassBound) {
                fixedIndex = boundIndex - 1;
            } else {
                fixedIndex = boundIndex;
            }
            interfaceBounds[fixedIndex].walk(annotation, path);
        }
    }

    private void walkEmptyTargetReturn(final TypeAnnotation annotation, final Iterator<Path> path) {
        result.walk(annotation, path);
    }

    private void walkEmptyTargetReceiver(final TypeAnnotation annotation, final Iterator<Path> path) {
        // first parameter is the receiver always - thus empty target
        final JavaTypeSignature signature = parameters.getSignatures()[0];

        signature.walk(annotation, path);
    }

    private void walkFormalParameterTarget(final TypeAnnotation annotation, final Iterator<Path> path) {
        final JavaTypeSignature[] signatures = parameters.getSignatures();
        final MethodFormalParameterTarget formalParameter = (MethodFormalParameterTarget) annotation.getTargetInfo();

        signatures[formalParameter.getFormalParameterIndex()].walk(annotation, path);
    }

    private void walkThrowsTarget(final TypeAnnotation annotation, final Iterator<Path> path) {
        final ThrowsSignature[] signatures = throwsSignatures.getSignatures();
        final ThrowsTarget throwsTarget = (ThrowsTarget) annotation.getTargetInfo();

        signatures[throwsTarget.getThrowsTypeIndex()].walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append(typeParameters);
        builder.append(' ');
        builder.append(result);
        builder.append(' ');
        builder.append(parameters);
        builder.append(' ');
        builder.append(throwsSignatures);

        return builder.toString();
    }
}
