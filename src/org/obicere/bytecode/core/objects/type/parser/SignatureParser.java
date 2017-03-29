package org.obicere.bytecode.core.objects.type.parser;

import org.javacore.type.signature.ArrayTypeSignature;
import org.javacore.type.signature.BaseType;
import org.javacore.type.signature.ClassSignature;
import org.javacore.type.signature.ClassTypeSignature;
import org.javacore.type.signature.FieldSignature;
import org.javacore.type.signature.JavaTypeSignature;
import org.javacore.type.signature.MethodSignature;
import org.javacore.type.signature.ReferenceTypeSignature;
import org.javacore.type.signature.ResultSignature;
import org.javacore.type.signature.SimpleClassTypeSignature;
import org.javacore.type.signature.ThrowsSignature;
import org.javacore.type.signature.TypeArgument;
import org.javacore.type.signature.TypeParameter;
import org.javacore.type.signature.TypeVariableSignature;
import org.javacore.type.signature.VoidDescriptor;
import org.obicere.bytecode.core.objects.type.signature.DefaultArrayTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultBaseType;
import org.obicere.bytecode.core.objects.type.signature.DefaultClassSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultClassTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultExtendsTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultFieldSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultMethodSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultSimpleClassTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultSuperTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultTypeParameter;
import org.obicere.bytecode.core.objects.type.signature.DefaultTypeVariableSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultUnboundedTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultVoidDescriptor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Obicere
 */
public class SignatureParser {

    private final QueueString string;

    public SignatureParser(final String string) {
        this.string = new QueueString(string);
    }

    public static String createSignature(final String superName, final String[] interfaceNames) {
        if (interfaceNames == null) {
            throw new NullPointerException("interfaceNames must be non-null");
        }
        final String safeName;
        if (superName == null) {
            safeName = "[java/lang/Object;";
        } else {
            safeName = superName;
        }

        final StringBuilder builder = new StringBuilder();

        appendName(safeName, builder);
        for (final String interfaceName : interfaceNames) {
            appendName(interfaceName, builder);
        }

        return builder.toString();
    }

    private static void appendName(final String name, final StringBuilder builder) {
        if (name == null) {
            throw new NullPointerException("name must be non-null");
        }
        if (!name.startsWith("L")) {
            builder.append('L');
        }
        builder.append(name);
        if (!name.endsWith(";")) {
            builder.append(';');
        }
    }

    public ClassSignature parseClassSignature() {
        final TypeParameter[] typeParameters = parseTypeParameters();
        final ClassTypeSignature superClass = parseClassTypeSignature();
        final ClassTypeSignature[] superInterfaces = parseClassTypeSignatures();

        return new DefaultClassSignature(typeParameters, superClass, superInterfaces);
    }

    public MethodSignature parseMethodSignature() {
        final TypeParameter[] typeParameters = parseTypeParameters();
        final JavaTypeSignature[] parameters = parseParameters();
        final ResultSignature result = parseResult();
        final ThrowsSignature[] throwsSignatures = parseThrowsSignatures();

        return new DefaultMethodSignature(typeParameters, parameters, result, throwsSignatures);
    }

    public FieldSignature parseFieldSignature() {
        final ReferenceTypeSignature signature = parseReferenceTypeSignature();
        return new DefaultFieldSignature(signature);
    }

    private ClassTypeSignature[] parseClassTypeSignatures() {
        final List<ClassTypeSignature> signatures = new LinkedList<>();
        while (string.hasNext()) {
            signatures.add(parseClassTypeSignature());
        }
        return signatures.toArray(new ClassTypeSignature[signatures.size()]);
    }

    private JavaTypeSignature[] parseParameters() {
        if (string.peek() != '(') {
            throw createError("Expected '(' character");
        }
        // skip (
        string.next();
        final List<JavaTypeSignature> parameterList = new LinkedList<>();
        while (string.peek() != ')') {
            final JavaTypeSignature parameter = parseJavaTypeSignature();
            parameterList.add(parameter);
        }
        // skip )
        string.next();

        return parameterList.toArray(new JavaTypeSignature[parameterList.size()]);
    }

    private JavaTypeSignature parseJavaTypeSignature() {
        final char next = string.peek();
        switch (next) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'Z':
                return parseBaseType();
            case 'L':
                return parseClassTypeSignature();
            case '[':
                return parseArrayTypeSignature();
            case 'T':
                return parseTypeVariableSignature();
            default:
                throw createError("Expected java type signature character");
        }
    }

    private ReferenceTypeSignature parseReferenceTypeSignature() {
        final char next = string.peek();
        switch (next) {
            case 'L':
                return parseClassTypeSignature();
            case '[':
                return parseArrayTypeSignature();
            case 'T':
                return parseTypeVariableSignature();
            default:
                throw createError("Expected reference type signature character");
        }
    }

    private BaseType parseBaseType() {
        final char next = string.peek();
        switch (next) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'Z':
                string.next();
                return new DefaultBaseType(next);
            default:
                throw createError("Expected base type character");
        }
    }

    private ClassTypeSignature parseClassTypeSignature() {
        if (string.peek() != 'L') {
            throw createError("Expected 'L' character");
        }
        string.next();

        final String packageSpecifier;

        String identifier = string.nextIdentifier();
        if (string.peek() == '/') {
            final StringBuilder builder = new StringBuilder();

            while (string.peek() == '/') {
                builder.append(identifier);
                builder.append('.');

                string.next();
                identifier = string.nextIdentifier();
            }

            packageSpecifier = builder.toString();
        } else {
            packageSpecifier = "";
        }

        final TypeArgument[] typeArguments = parseTypeArguments();

        final SimpleClassTypeSignature signature = new DefaultSimpleClassTypeSignature(identifier, typeArguments);

        final List<SimpleClassTypeSignature> suffixes = new LinkedList<>();

        while (string.peek() == '.') {
            string.next();
            final SimpleClassTypeSignature suffix = parseSimpleClassTypeSignature();
            suffixes.add(suffix);
        }
        if (string.peek() != ';') {
            throw createError("Expected ';' character");
        }
        string.next();

        final SimpleClassTypeSignature[] suffix = suffixes.toArray(new SimpleClassTypeSignature[suffixes.size()]);

        return new DefaultClassTypeSignature(packageSpecifier, signature, suffix);
    }

    private SimpleClassTypeSignature parseSimpleClassTypeSignature() {
        final String identifier = string.nextIdentifier();
        final TypeArgument[] arguments = parseTypeArguments();

        return new DefaultSimpleClassTypeSignature(identifier, arguments);
    }

    private TypeVariableSignature parseTypeVariableSignature() {
        if (string.peek() != 'T') {
            throw createError("Excepted 'T' character");
        }
        string.next();
        final String identifier = string.nextIdentifier();

        if (string.peek() != ';') {
            throw createError("Excepted ';' character");
        }
        string.next();
        return new DefaultTypeVariableSignature(identifier);
    }

    private ArrayTypeSignature parseArrayTypeSignature() {
        if (string.peek() != '[') {
            throw createError("Excepted '[' character");
        }
        string.next();
        final JavaTypeSignature signature = parseJavaTypeSignature();
        return new DefaultArrayTypeSignature(signature);
    }

    private TypeArgument[] parseTypeArguments() {
        if (string.peek() != '<') {
            return new TypeArgument[0];
        } else {
            final List<TypeArgument> arguments = new LinkedList<>();

            // skip <
            string.next();

            if (string.peek() == '>') {
                throw createError("Expected at least one type argument");
            }

            while (string.peek() != '>') {
                final TypeArgument argument = parseTypeArgument();
                arguments.add(argument);
            }
            // skip >
            string.next();

            return arguments.toArray(new TypeArgument[arguments.size()]);
        }
    }

    private TypeArgument parseTypeArgument() {
        final char next = string.peek();
        switch (next) {
            case '-':
                string.next();
                return new DefaultSuperTypeArgument(parseReferenceTypeSignature());
            case '*':
                string.next();
                return new DefaultUnboundedTypeArgument();
            case '+':
                string.next();
                // fall through
                // the '+' is optional
            default:
                return new DefaultExtendsTypeArgument(parseReferenceTypeSignature());
        }
    }

    private TypeParameter[] parseTypeParameters() {
        if (string.peek() != '<') {
            return new TypeParameter[0];
        } else {
            final List<TypeParameter> arguments = new LinkedList<>();

            // skip <
            string.next();

            if (string.peek() == '>') {
                throw createError("Expected at least one type parameter");
            }

            while (string.peek() != '>') {
                final TypeParameter argument = parseTypeParameter();
                arguments.add(argument);
            }
            // skip >
            string.next();

            return arguments.toArray(new TypeParameter[arguments.size()]);
        }
    }

    private TypeParameter parseTypeParameter() {
        final String identifier = string.nextIdentifier();
        if (string.peek() != ':') {
            throw createError("Expected ':' character");
        }
        // skip :
        string.next();
        final ReferenceTypeSignature classBound;
        if (string.peek() == ':') {
            // TODO move out and clean this up
            classBound = new DefaultClassTypeSignature("java.lang.", new DefaultSimpleClassTypeSignature("Object", new TypeArgument[0]), new DefaultSimpleClassTypeSignature[0]);
        } else {
            classBound = parseReferenceTypeSignature();
        }
        final List<ReferenceTypeSignature> interfaceBounds = new LinkedList<>();
        while (string.peek() == ':') {
            // skip :
            string.next();
            interfaceBounds.add(parseReferenceTypeSignature());
        }

        final ReferenceTypeSignature[] interfaces = interfaceBounds.toArray(new ReferenceTypeSignature[interfaceBounds.size()]);
        return new DefaultTypeParameter(identifier, classBound, interfaces);
    }

    private ResultSignature parseResult() {
        if (string.peek() == 'V') {
            return parseVoidDescriptor();
        } else {
            return parseJavaTypeSignature();
        }
    }

    private ThrowsSignature[] parseThrowsSignatures() {
        if (string.peek() != '^') {
            return new ThrowsSignature[0];
        } else {
            final List<ThrowsSignature> signatures = new LinkedList<>();
            while (string.peek() == '^') {
                string.next();
                final ThrowsSignature signature;
                if (string.peek() == 'L') {
                    signature = parseClassTypeSignature();
                } else if (string.peek() == 'T') {
                    signature = parseTypeVariableSignature();
                } else {
                    throw createError("Expected either class type signature or type variable signature");
                }
                signatures.add(signature);
            }
            return signatures.toArray(new ThrowsSignature[signatures.size()]);
        }
    }

    private VoidDescriptor parseVoidDescriptor() {
        if (string.peek() != 'V') {
            throw createError("Excepted 'V' character");
        }
        string.next();
        return DefaultVoidDescriptor.getInstance();
    }

    private FormatException createError(final String message) {
        return new FormatException(message, string);
    }

}
