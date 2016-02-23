package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class BaseType extends JavaTypeSignature {

    public static final String IDENTIFIER = "BaseType";

    private final String type;

    private BaseType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static BaseType parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final char next = string.next();
        final String type = getType(next);

        if (type == null) {
            return null;
        }

        return new BaseType(type);
    }

    private static String getType(final char value) {
        switch (value) {
            case 'B':
                return "byte";
            case 'C':
                return "char";
            case 'D':
                return "double";
            case 'F':
                return "float";
            case 'I':
                return "int";
            case 'J':
                return "long";
            case 'S':
                return "short";
            case 'V':
                return "void";
            case 'Z':
                return "boolean";
            default:
                return null;
        }
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (path.hasNext()) {
            // illegal state, base types have no children
            return;
        }
        add(annotation);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
