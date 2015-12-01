package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

import java.util.Iterator;

/**
 */
public class BaseType extends JavaTypeSignature {

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
        final String type;
        switch (next) {
            case 'B':
                type = "byte";
                break;
            case 'C':
                type = "char";
                break;
            case 'D':
                type = "double";
                break;
            case 'F':
                type = "float";
                break;
            case 'I':
                type = "int";
                break;
            case 'J':
                type = "long";
                break;
            case 'S':
                type = "short";
                break;
            case 'V':
                type = "void";
                break;
            case 'Z':
                type = "boolean";
                break;
            default:
                return null;
        }
        return new BaseType(type);
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
    public void model(final DocumentBuilder builder) {
        for (final Annotation annotation : getAnnotations()) {
            annotation.model(builder);
        }
        builder.addKeyword(type);
    }
}
