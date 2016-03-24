package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;
import java.util.LinkedList;

/**
 */
public class TypeParameter extends AnnotationTarget {

    public static final String IDENTIFIER = "TypeParameter";

    private final String name;

    private final ClassBound classBound;

    private final InterfaceBound[] interfaceBounds;

    private TypeParameter(final String name, final ClassBound classBound, final InterfaceBound[] interfaceBounds) {
        this.name = name;
        this.classBound = classBound;
        this.interfaceBounds = interfaceBounds;
    }

    public String getName() {
        return name;
    }

    public ClassBound getClassBound() {
        return classBound;
    }

    public InterfaceBound[] getInterfaceBounds() {
        return interfaceBounds;
    }

    public static TypeParameter parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final String identifier = string.nextIdentifier();
        if (identifier == null) {
            return null;
        }

        final ClassBound classBound = ClassBound.parse(string);
        if (classBound == null) {
            return null;
        }

        final LinkedList<InterfaceBound> interfaceBoundList = new LinkedList<>();
        while (string.hasNext() && string.peek() == ':') {
            final InterfaceBound interfaceBound = InterfaceBound.parse(string);
            if (interfaceBound == null) {
                return null;
            }
            interfaceBoundList.add(interfaceBound);
        }
        final InterfaceBound[] interfaceBounds = interfaceBoundList.toArray(new InterfaceBound[interfaceBoundList.size()]);
        return new TypeParameter(identifier, classBound, interfaceBounds);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (!path.hasNext()) {
            add(annotation);
            return;
        }
        final Path next = path.next();
        final int kind = next.getTypePathKind();
        if (kind == Path.KIND_TYPE_ARGUMENT) {
            final int typeIndex = next.getTypeArgumentIndex();
            if (typeIndex == 0) {
                final ReferenceTypeSignature referenceTypeSignature = classBound.getReferenceTypeSignature();
                if (referenceTypeSignature != null) {
                    referenceTypeSignature.walk(annotation, path);
                } else {
                    interfaceBounds[0].walk(annotation, path);
                }
            } else {
                final int fixedIndex;
                if (classBound.getReferenceTypeSignature() != null) {
                    fixedIndex = typeIndex - 1;
                } else {
                    fixedIndex = typeIndex;
                }
                interfaceBounds[fixedIndex].walk(annotation, path);
            }
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append(name);

        boolean extendsAdded = false;
        final String classBoundValue = classBound.toString();
        if (!classBoundValue.equals("")) {
            builder.append(" extends ");
            builder.append(classBoundValue);

            extendsAdded = true;
        }

        for (int i = 0; i < interfaceBounds.length; i++) {
            if (i == 0 && !extendsAdded) {
                builder.append(" extends ");
            } else {
                builder.append(", ");
            }
            builder.append(interfaceBounds[i]);
        }
        return builder.toString();
    }
}
