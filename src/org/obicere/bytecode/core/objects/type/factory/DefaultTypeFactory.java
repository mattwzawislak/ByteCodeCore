package org.obicere.bytecode.core.objects.type.factory;

import org.javacore.JCClass;
import org.javacore.type.ArrayType;
import org.javacore.type.GenericType;
import org.javacore.type.PrimitiveType;
import org.javacore.type.ReferenceType;
import org.javacore.type.Type;
import org.javacore.type.TypedClass;
import org.javacore.type.VoidType;
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
import org.obicere.bytecode.core.objects.type.BooleanType;
import org.obicere.bytecode.core.objects.type.ByteType;
import org.obicere.bytecode.core.objects.type.CharType;
import org.obicere.bytecode.core.objects.type.DefaultArrayType;
import org.obicere.bytecode.core.objects.type.DefaultGenericType;
import org.obicere.bytecode.core.objects.type.DefaultTypedClass;
import org.obicere.bytecode.core.objects.type.DefaultVoidType;
import org.obicere.bytecode.core.objects.type.DefaultWildCardType;
import org.obicere.bytecode.core.objects.type.DoubleType;
import org.obicere.bytecode.core.objects.type.FloatType;
import org.obicere.bytecode.core.objects.type.IntType;
import org.obicere.bytecode.core.objects.type.LongType;
import org.obicere.bytecode.core.objects.type.ShortType;
import org.obicere.bytecode.core.objects.type.TypeLoader;

/**
 * @author Obicere
 */
public class DefaultTypeFactory implements TypeFactory {

    private GenericDeclarationDeclarer declaration;

    public DefaultTypeFactory(final GenericDeclarationDeclarer<?> declaration) {
        this.declaration = declaration;
    }

    protected WildCardType[] getWildcards(final TypeArgument[] arguments) {
        final DefaultWildCardType[] types = new DefaultWildCardType[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            types[i] = (DefaultWildCardType) arguments[i].getType(this);
        }
        return types;
    }

    @Override
    public TypedClass createClassType(final ClassTypeSignature type) {
        final StringBuilder builder = new StringBuilder(type.getPackage().replace('/', '.'));

        SimpleClassTypeSignature signature = type.getSignature();
        builder.append(signature.getIdentifier());

        JCClass rawType = (JCClass) TypeLoader.getSystemLoader().getType(builder.toString());

        WildCardType[] wildcards = getWildcards(signature.getTypeArguments());
        TypedClass result = new DefaultTypedClass(rawType, wildcards, null);

        for (int i = 0; i < type.getSuffixes().length; i++) {
            signature = type.getSuffixes()[i];

            builder.append('$');
            builder.append(signature.getIdentifier());

            rawType = (JCClass) TypeLoader.getSystemLoader().getType(builder.toString());
            wildcards = getWildcards(signature.getTypeArguments());
            result = new DefaultTypedClass(rawType, wildcards, result);
        }

        return result;
    }

    @Override
    public ArrayType createArrayType(final TypeSignature type) {
        final Type component = type.getType(this);

        return new DefaultArrayType(component);
    }

    @Override
    public GenericType createGenericType(final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
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
    public VoidType createVoidType() {
        return DefaultVoidType.getInstance();
    }
}
