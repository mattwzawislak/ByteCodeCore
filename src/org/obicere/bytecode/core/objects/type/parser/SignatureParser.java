package org.obicere.bytecode.core.objects.type.parser;

import org.obicere.bytecode.core.objects.type.signature.ArrayTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultBaseType;
import org.obicere.bytecode.core.objects.type.signature.DefaultClassSignature;
import org.obicere.bytecode.core.objects.type.signature.ClassTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultExtendsTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultFieldSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultMethodSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultSimpleClassTypeSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultSuperTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultTypeParameter;
import org.obicere.bytecode.core.objects.type.signature.DefaultTypeVariableSignature;
import org.obicere.bytecode.core.objects.type.signature.DefaultUnboundedTypeArgument;
import org.obicere.bytecode.core.objects.type.signature.DefaultVoidDescriptor;
import org.obicere.bytecode.core.objects.type.signature.ReferenceTypeSignature;

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

    public DefaultClassSignature parseClassSignature() {
        final DefaultTypeParameter[] typeParameters = parseTypeParameters();
        final ClassTypeSignature superClass = parseClassTypeSignature();
        final ClassTypeSignature[] superInterfaces = parseClassTypeSignatures();

        return new DefaultClassSignature(typeParameters, superClass, superInterfaces);
    }

    public DefaultMethodSignature parseMethodSignature() {
        final DefaultTypeParameter[] typeParameters = parseTypeParameters();
        final JavaTypeSignature[] parameters = parseParameters();
        final Result result = parseResult();
        final ThrowsSignature[] throwsSignatures = parseThrowsSignatures();

        return new DefaultMethodSignature(typeParameters, parameters, result, throwsSignatures);
    }

    public DefaultFieldSignature parseFieldSignature() {
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
            throw error("Expected '(' character");
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
                throw error("Expected java type signature character");
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
                throw error("Expected reference type signature character");
        }
    }

    private DefaultBaseType parseBaseType() {
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
                throw error("Expected base type character");
        }
    }

    private ClassTypeSignature parseClassTypeSignature() {
        if (string.peek() != 'L') {
            throw error("Expected 'L' character");
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

        final DefaultSimpleClassTypeSignature signature = new DefaultSimpleClassTypeSignature(identifier, typeArguments);

        final List<DefaultSimpleClassTypeSignature> suffixes = new LinkedList<>();

        while (string.peek() == '.') {
            string.next();
            final DefaultSimpleClassTypeSignature suffix = parseSimpleClassTypeSignature();
            suffixes.add(suffix);
        }
        if (string.peek() != ';') {
            throw error("Expected ';' character");
        }
        string.next();

        final DefaultSimpleClassTypeSignature[] suffix = suffixes.toArray(new DefaultSimpleClassTypeSignature[suffixes.size()]);

        return new ClassTypeSignature(packageSpecifier, signature, suffix);
    }

    private DefaultSimpleClassTypeSignature parseSimpleClassTypeSignature() {
        final String identifier = string.nextIdentifier();
        final TypeArgument[] arguments = parseTypeArguments();

        return new DefaultSimpleClassTypeSignature(identifier, arguments);
    }

    private DefaultTypeVariableSignature parseTypeVariableSignature() {
        if (string.peek() != 'T') {
            throw error("Excepted 'T' character");
        }
        string.next();
        final String identifier = string.nextIdentifier();

        if (string.peek() != ';') {
            throw error("Excepted ';' character");
        }
        string.next();
        return new DefaultTypeVariableSignature(identifier);
    }

    private ArrayTypeSignature parseArrayTypeSignature() {
        if (string.peek() != '[') {
            throw error("Excepted '[' character");
        }
        string.next();
        final JavaTypeSignature signature = parseJavaTypeSignature();
        return new ArrayTypeSignature(signature);
    }

    private TypeArgument[] parseTypeArguments() {
        if (string.peek() != '<') {
            return new TypeArgument[0];
        } else {
            final List<TypeArgument> arguments = new LinkedList<>();

            // skip <
            string.next();

            if (string.peek() == '>') {
                throw error("Expected at least one type argument");
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

    private DefaultTypeParameter[] parseTypeParameters() {
        if (string.peek() != '<') {
            return new DefaultTypeParameter[0];
        } else {
            final List<DefaultTypeParameter> arguments = new LinkedList<>();

            // skip <
            string.next();

            if (string.peek() == '>') {
                throw error("Expected at least one type parameter");
            }

            while (string.peek() != '>') {
                final DefaultTypeParameter argument = parseTypeParameter();
                arguments.add(argument);
            }
            // skip >
            string.next();

            return arguments.toArray(new DefaultTypeParameter[arguments.size()]);
        }
    }

    private DefaultTypeParameter parseTypeParameter() {
        final String identifier = string.nextIdentifier();
        if (string.peek() != ':') {
            throw error("Expected ':' character");
        }
        // skip :
        string.next();
        final ReferenceTypeSignature classBound;
        if (string.peek() == ':') {
            classBound = new ClassTypeSignature("java.lang.", new DefaultSimpleClassTypeSignature("Object", new TypeArgument[0]), new DefaultSimpleClassTypeSignature[0]);
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

    private Result parseResult() {
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
                    throw error("Expected either class type signature or type variable signature");
                }
                signatures.add(signature);
            }
            return signatures.toArray(new ThrowsSignature[signatures.size()]);
        }
    }

    private DefaultVoidDescriptor parseVoidDescriptor() {
        if (string.peek() != 'V') {
            throw error("Excepted 'V' character");
        }
        string.next();
        return DefaultVoidDescriptor.getInstance();
    }

    private FormatException error(final String message) {
        return new FormatException(message, string);
    }

}
