package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.type.generation.TypeFactory;
import org.obicere.bytecode.core.type.generic.GenericDeclarationDeclarer;
import org.obicere.bytecode.core.type.signature.ClassTypeSignature;
import org.obicere.bytecode.core.type.signature.ReferenceTypeSignature;
import org.obicere.bytecode.core.type.signature.SimpleClassTypeSignature;
import org.obicere.bytecode.core.type.signature.TypeArgument;
import org.obicere.bytecode.core.type.signature.TypeSignature;
import org.obicere.bytecode.core.type.signature.TypeVariableSignature;

/**
 * @author Obicere
 */
public class AccessibleTypeFactory implements TypeFactory {

    private GenericDeclarationDeclarer declaration;

    public AccessibleTypeFactory(final GenericDeclarationDeclarer<?> declaration) {
        this.declaration = declaration;
    }

    private WildcardType[] getWildcards(final TypeArgument[] arguments) {
        final WildcardType[] types = new WildcardType[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            types[i] = (WildcardType) arguments[i].getType(this);
        }
        return types;
    }

    @Override
    public Type createClassType(final ClassTypeSignature type) {
        final StringBuilder builder = new StringBuilder(type.getPackage().replace('/', '.'));

        boolean parameters = false;

        SimpleClassTypeSignature signature = type.getSignature();
        builder.append(signature.getIdentifier());

        Type result;

        ClassType rawType = (ClassType) TypeLoader.getSystemLoader().getType(builder.toString());
        if (signature.getArguments().length != 0) {
            final WildcardType[] wildcards = getWildcards(signature.getArguments());
            result = new ParameterizedType(rawType, wildcards, null);
            parameters = true;
        } else {
            result = rawType;
        }
        for (int i = 0; i < type.getSuffixes().length; i++) {
            signature = type.getSuffixes()[i];

            builder.append('$');
            builder.append(signature.getIdentifier());

            rawType = (ClassType) TypeLoader.getSystemLoader().getType(builder.toString());
            if (parameters || signature.getArguments().length != 0) {
                final WildcardType[] wildcards = getWildcards(signature.getArguments());
                result = new ParameterizedType(rawType, wildcards, (ReferenceType) result);
                parameters = true;
            } else {
                result = rawType;
            }
        }

        return result;
    }

    @Override
    public ArrayType createArrayType(final TypeSignature type) {
        final Type component = type.getType(this);

        return new ArrayType(component);
    }

    @Override
    public GenericType createGenericType(final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
        return new GenericType(declaration.getDeclaration(), name, classBound, interfaceBounds);
    }

    @Override
    public GenericType getGenericType(final TypeVariableSignature name) {
        return declaration.getDeclaration().getGenericType(name.getIdentifier());
    }

    @Override
    public WildcardType createWildcardType(final WildcardIndicator indicator, final ReferenceTypeSignature bound) {
        final ReferenceType type = (ReferenceType) bound.getType(this);
        return new WildcardType(indicator, type);
    }

    @Override
    public BooleanType createBooleanType() {
        return BooleanType.getInstance();
    }

    @Override
    public ByteType createByteType() {
        return ByteType.getInstance();
    }

    @Override
    public ShortType createShortType() {
        return ShortType.getInstance();
    }

    @Override
    public CharType createCharType() {
        return CharType.getInstance();
    }

    @Override
    public IntType createIntType() {
        return IntType.getInstance();
    }

    @Override
    public FloatType createFloatType() {
        return FloatType.getInstance();
    }

    @Override
    public LongType createLongType() {
        return LongType.getInstance();
    }

    @Override
    public DoubleType createDoubleType() {
        return DoubleType.getInstance();
    }

    @Override
    public VoidType createVoidType() {
        return VoidType.getInstance();
    }
}
