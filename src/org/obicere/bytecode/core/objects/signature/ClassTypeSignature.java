package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;
import java.util.LinkedList;

/**
 */
public class ClassTypeSignature extends ReferenceTypeSignature {

    public static final String IDENTIFIER = "ClassTypeSignature";

    private final PackageSpecifier           packageSpecifier;
    private final SimpleClassTypeSignature   simpleClassTypeSignature;
    private final ClassTypeSignatureSuffix[] classTypeSignatureSuffix;

    private ClassTypeSignature(final PackageSpecifier packageSpecifier, final SimpleClassTypeSignature simpleClassTypeSignature, final ClassTypeSignatureSuffix[] classTypeSignatureSuffix) {
        this.packageSpecifier = packageSpecifier;
        this.simpleClassTypeSignature = simpleClassTypeSignature;
        this.classTypeSignatureSuffix = classTypeSignatureSuffix;
    }

    public PackageSpecifier getPackageSpecifier() {
        return packageSpecifier;
    }

    public SimpleClassTypeSignature getSimpleClassTypeSignature() {
        return simpleClassTypeSignature;
    }

    public ClassTypeSignatureSuffix[] getClassTypeSignatureSuffix() {
        return classTypeSignatureSuffix;
    }

    public static ClassTypeSignature parse(final QueueString string) {
        if (!string.hasNext() || string.next() != 'L') {
            return null;
        }
        final PackageSpecifier packageSpecifier = PackageSpecifier.parse(string);
        if (packageSpecifier == null) {
            return null;
        }
        final SimpleClassTypeSignature simpleClassTypeSignature = SimpleClassTypeSignature.parse(string);
        if (simpleClassTypeSignature == null) {
            return null;
        }
        if (!string.hasNext(';')) {
            return null;
        }
        final LinkedList<ClassTypeSignatureSuffix> suffixList = new LinkedList<>();
        char next = string.peek();
        while (string.hasNext() && next != ';') {
            final ClassTypeSignatureSuffix suffix = ClassTypeSignatureSuffix.parse(string);
            if (suffix == null) {
                return null;
            }
            suffixList.add(suffix);
            next = string.peek();
        }
        if (string.next() != ';') {
            return null;
        }
        return new ClassTypeSignature(packageSpecifier, simpleClassTypeSignature, suffixList.toArray(new ClassTypeSignatureSuffix[suffixList.size()]));
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (!path.hasNext()) {
            // we found an annotation
            add(annotation);
            return;
        }
        final Path next = path.next();
        final int kind = next.getTypePathKind();
        if (kind == Path.KIND_NESTED) {
            walkNested(annotation, path);
        } else if (kind == Path.KIND_TYPE_ARGUMENT) {
            walkTypeArgument(annotation, path, simpleClassTypeSignature, next);
        }
    }

    private void walkNested(final TypeAnnotation annotation, final Iterator<Path> path) {

        int i = 0;
        ClassTypeSignatureSuffix suffix = classTypeSignatureSuffix[0];

        while (path.hasNext()) {
            final Path next = path.next();
            final int kind = next.getTypePathKind();
            if (kind == Path.KIND_NESTED) {
                suffix = classTypeSignatureSuffix[++i];
            } else if (kind == Path.KIND_TYPE_ARGUMENT) {
                final SimpleClassTypeSignature simple = suffix.getSimpleClassTypeSignature();

                walkTypeArgument(annotation, path, simple, next);

                return;
            }
        }
    }

    private void walkTypeArgument(final TypeAnnotation annotation, final Iterator<Path> path, final SimpleClassTypeSignature simpleClassTypeSignature, final Path next) {
        final TypeArguments typeArguments = simpleClassTypeSignature.getTypeArguments();

        final TypeArgument[] types = typeArguments.getTypeArguments();

        final int typeArgumentIndex = next.getTypeArgumentIndex();
        final TypeArgument type = types[typeArgumentIndex];

        final WildcardIndicator wildcardIndicator = type.getWildcardIndicator();
        wildcardIndicator.walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(packageSpecifier);
        builder.append(simpleClassTypeSignature);
        for (final ClassTypeSignatureSuffix suffix : classTypeSignatureSuffix) {
            builder.append('.');
            builder.append(suffix);
        }
        return builder.toString();
    }
}
