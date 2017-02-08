package org.obicere.bytecode.core.objects.type;

import org.javacore.JCClass;
import org.javacore.type.GenericType;
import org.javacore.type.PrimitiveType;
import org.javacore.type.ReferenceType;
import org.javacore.type.Type;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.WildCardType;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.GenericDeclarationDeclarer;
import org.javacore.type.signature.ClassTypeSignature;
import org.javacore.type.signature.ReferenceTypeSignature;
import org.javacore.type.signature.SimpleClassTypeSignature;
import org.javacore.type.signature.TypeArgument;
import org.javacore.type.signature.TypeSignature;
import org.javacore.type.signature.TypeVariableSignature;

/**
 * @author Obicere
 */
public class AccessibleTypeFactory implements TypeFactory {

    private GenericDeclarationDeclarer declaration;

    public AccessibleTypeFactory(final GenericDeclarationDeclarer<?> declaration) {
        this.declaration = declaration;
    }

    private DefaultWildCardType[] getWildcards(final TypeArgument[] arguments) {
        final DefaultWildCardType[] types = new DefaultWildCardType[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            types[i] = (DefaultWildCardType) arguments[i].getType(this);
        }
        return types;
    }

    @Override
    public Type createClassType(final ClassTypeSignature type) {
        final StringBuilder builder = new StringBuilder(type.getPackage().replace('/', '.'));

        SimpleClassTypeSignature signature = type.getSignature();
        builder.append(signature.getIdentifier());

        JCClass rawType = (JCClass) TypeLoader.getSystemLoader().getType(builder.toString());

        WildCardType[] wildcards = getWildcards(signature.getArguments());
        JCClass result = new DefaultTypedClass(rawType, wildcards, null);

        for (int i = 0; i < type.getSuffixes().length; i++) {
            signature = type.getSuffixes()[i];

            builder.append('$');
            builder.append(signature.getIdentifier());

            rawType = (JCClass) TypeLoader.getSystemLoader().getType(builder.toString());
            wildcards = getWildcards(signature.getArguments());
            result = new DefaultTypedClass(rawType, wildcards, result);
        }

        return result;
    }

    @Override
    public DefaultArrayType createArrayType(final TypeSignature type) {
        final Type component = type.getType(this);

        return new DefaultArrayType(component);
    }

    @Override
    public DefaultGenericType createGenericType(final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
        return new DefaultGenericType(declaration.getDeclaration(), name, classBound, interfaceBounds);
    }

    @Override
    public GenericType getGenericType(final TypeVariableSignature name) {
        return declaration.getDeclaration().getGenericType(name.getIdentifier());
    }

    @Override
    public WildCardType createWildcardType(final WildCardIndicator indicator, final ReferenceTypeSignature bound) {
        final ReferenceType type = (ReferenceType) bound.getType(this);
        return new DefaultWildCardType(indicator, type);
    }

    @Override
    public PrimitiveType createBooleanType() {
        return BooleanType.getInstance();
    }

    @Override
    public PrimitiveType createByteType() {
        return ByteType.getInstance();
    }

    @Override
    public PrimitiveType createShortType() {
        return ShortType.getInstance();
    }

    @Override
    public PrimitiveType createCharType() {
        return CharType.getInstance();
    }

    @Override
    public PrimitiveType createIntType() {
        return IntType.getInstance();
    }

    @Override
    public PrimitiveType createFloatType() {
        return FloatType.getInstance();
    }

    @Override
    public PrimitiveType createLongType() {
        return LongType.getInstance();
    }

    @Override
    public PrimitiveType createDoubleType() {
        return DoubleType.getInstance();
    }

    @Override
    public org.javacore.type.VoidType createVoidType() {
        return DefaultVoidType.getInstance();
    }
}
