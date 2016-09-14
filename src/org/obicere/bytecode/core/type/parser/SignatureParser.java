package org.obicere.bytecode.core.type.parser;

import org.obicere.bytecode.core.type.signature.ArrayTypeSignature;
import org.obicere.bytecode.core.type.signature.BaseType;
import org.obicere.bytecode.core.type.signature.ClassSignature;
import org.obicere.bytecode.core.type.signature.ClassTypeSignature;
import org.obicere.bytecode.core.type.signature.ExtendsTypeArgument;
import org.obicere.bytecode.core.type.signature.FieldSignature;
import org.obicere.bytecode.core.type.signature.JavaTypeSignature;
import org.obicere.bytecode.core.type.signature.MethodSignature;
import org.obicere.bytecode.core.type.signature.ReferenceTypeSignature;
import org.obicere.bytecode.core.type.signature.Result;
import org.obicere.bytecode.core.type.signature.SimpleClassTypeSignature;
import org.obicere.bytecode.core.type.signature.SuperTypeArgument;
import org.obicere.bytecode.core.type.signature.ThrowsSignature;
import org.obicere.bytecode.core.type.signature.TypeArgument;
import org.obicere.bytecode.core.type.signature.TypeParameter;
import org.obicere.bytecode.core.type.signature.TypeVariableSignature;
import org.obicere.bytecode.core.type.signature.UnboundedTypeArgument;
import org.obicere.bytecode.core.type.signature.VoidDescriptor;

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

    public ClassSignature parseClassSignature() {
        final TypeParameter[] typeParameters = parseTypeParameters();
        final ClassTypeSignature superClass = parseClassTypeSignature();
        final ClassTypeSignature[] superInterfaces = parseClassTypeSignatures();

        return new ClassSignature(typeParameters, superClass, superInterfaces);
    }

    public MethodSignature parseMethodSignature() {
        final TypeParameter[] typeParameters = parseTypeParameters();
        final JavaTypeSignature[] parameters = parseParameters();
        final Result result = parseResult();
        final ThrowsSignature[] throwsSignatures = parseThrowsSignatures();

        return new MethodSignature(typeParameters, parameters, result, throwsSignatures);
    }

    public FieldSignature parseFieldSignature() {
        final ReferenceTypeSignature signature = parseReferenceTypeSignature();
        return new FieldSignature(signature);
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
                return new BaseType(next);
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

        final SimpleClassTypeSignature signature = new SimpleClassTypeSignature(identifier, typeArguments);

        final List<SimpleClassTypeSignature> suffixes = new LinkedList<>();

        while (string.peek() == '.') {
            string.next();
            final SimpleClassTypeSignature suffix = parseSimpleClassTypeSignature();
            suffixes.add(suffix);
        }
        if (string.peek() != ';') {
            throw error("Expected ';' character");
        }
        string.next();

        final SimpleClassTypeSignature[] suffix = suffixes.toArray(new SimpleClassTypeSignature[suffixes.size()]);

        return new ClassTypeSignature(packageSpecifier, signature, suffix);
    }

    private SimpleClassTypeSignature parseSimpleClassTypeSignature() {
        final String identifier = string.nextIdentifier();
        final TypeArgument[] arguments = parseTypeArguments();

        return new SimpleClassTypeSignature(identifier, arguments);
    }

    private TypeVariableSignature parseTypeVariableSignature() {
        if (string.peek() != 'T') {
            throw error("Excepted 'T' character");
        }
        string.next();
        final String identifier = string.nextIdentifier();

        if (string.peek() != ';') {
            throw error("Excepted ';' character");
        }
        string.next();
        return new TypeVariableSignature(identifier);
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
                return new SuperTypeArgument(parseReferenceTypeSignature());
            case '*':
                string.next();
                return new UnboundedTypeArgument();
            case '+':
                string.next();
                // fall through
                // the '+' is optional
            default:
                return new ExtendsTypeArgument(parseReferenceTypeSignature());
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
                throw error("Expected at least one type parameter");
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
            throw error("Expected ':' character");
        }
        // skip :
        string.next();
        final ReferenceTypeSignature classBound;
        if (string.peek() == ':') {
            classBound = new ClassTypeSignature("java.lang.", new SimpleClassTypeSignature("Object", new TypeArgument[0]), new SimpleClassTypeSignature[0]);
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
        return new TypeParameter(identifier, classBound, interfaces);
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

    private VoidDescriptor parseVoidDescriptor() {
        if (string.peek() != 'V') {
            throw error("Excepted 'V' character");
        }
        string.next();
        return VoidDescriptor.getInstance();
    }

    private FormatException error(final String message) {
        return new FormatException(message, string);
    }

}
