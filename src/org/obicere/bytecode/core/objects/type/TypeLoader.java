package org.obicere.bytecode.core.objects.type;

import org.javacore.type.Type;
import org.javacore.type.TypeRepository;
import org.javacore.type.generic.Declaration;
import org.obicere.bytecode.core.objects.type.path.ClassPath;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Obicere
 */
public final class TypeLoader implements TypeRepository {

    private final Map<String, Type> types = new Hashtable<>();

    private static final TypeLoader SYSTEM = new TypeLoader();

    private final ClassPath classPath;

    public TypeLoader() {
        this(ClassPath.getSystemClassPath());
    }

    public TypeLoader(final ClassPath classPath) {
        if (classPath == null) {
            throw new NullPointerException("class path must be non-null.");
        }
        this.classPath = classPath;

        installDefaults();
    }

    public static TypeLoader getSystemLoader() {
        return SYSTEM;
    }

    private void installDefaults() {

        // primitive type names informal
        types.put("byte", ByteType.getInstance());
        types.put("boolean", BooleanType.getInstance());
        types.put("char", CharType.getInstance());
        types.put("double", DoubleType.getInstance());
        types.put("float", FloatType.getInstance());
        types.put("int", IntType.getInstance());
        types.put("long", LongType.getInstance());
        types.put("short", ShortType.getInstance());

        // void
        types.put("void", DefaultVoidType.getInstance());

        // primitive type names formal
        types.put("B", ByteType.getInstance());
        types.put("Z", BooleanType.getInstance());
        types.put("C", CharType.getInstance());
        types.put("D", DoubleType.getInstance());
        types.put("F", FloatType.getInstance());
        types.put("I", IntType.getInstance());
        types.put("J", LongType.getInstance());
        types.put("S", ShortType.getInstance());

        // void
        types.put("V", DefaultVoidType.getInstance());

        // common Java classes
        getType(Object.class.getName());
        getType(String.class.getName());
        getType(Throwable.class.getName());
        getType(Serializable.class.getName());
        getType(Cloneable.class.getName());
        getType(System.class.getName());
    }

    @Override
    public Type getType(final String name) {
        if (name == null) {
            throw new NullPointerException("name must be non-null.");
        }
        final String corrected = name.replace('.', '/');
        final Type type = types.get(corrected);
        if (type != null) {
            return type;
        } else {
            return loadType(corrected, null);
        }
    }

    @Override
    public Type getType(final String name, final Declaration<?> scope) {
        if (name == null) {
            throw new NullPointerException("name must be non-null.");
        }
        final String corrected = name.replace('.', '/');
        final Type type = types.get(corrected);
        if (type != null) {
            return type;
        } else {
            return loadType(corrected, scope);
        }
    }

    private Type loadType(final String name, final Declaration<?> scope) {
        // TODO make clean and reliable. Define a well-formed behavior
        // TODO add in the trace elements to resolve name changes (?)
        final Type newType;

        if (name.startsWith("[")) {
            final String component = name.substring(1);
            final Type componentType = getType(component);

            newType = new DefaultArrayType(componentType);
        } else if (name.endsWith("[]")) {
            // dealing with an array
            final String component = name.substring(0, name.length() - 2);
            final Type componentType = getType(component);

            newType = new DefaultArrayType(componentType);
        } else if (name.startsWith("L") && name.endsWith(";")) {
            // dealing with class
            final String cleanName = name.substring(1, name.length() - 1);

            return getType(cleanName);
        } else {
            if (scope != null) {
                final Type type = scope.getDeclaration().getGenericType(name);
                if (type != null) {
                    return type;
                }

            }
            // primitive classes shouldn't reach here,
            // ideally they are pre-loaded
            newType = classPath.find(name);
        }

        final Type existing = types.get(newType.getName());

        if (existing != null) {
            // that's not good
            return existing;
        } else {
            types.put(newType.getName(), newType);
            return newType;
        }
    }
}
