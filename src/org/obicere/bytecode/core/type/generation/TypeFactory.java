package org.obicere.bytecode.core.type.generation;

import org.obicere.bytecode.core.type.ArrayType;
import org.obicere.bytecode.core.type.BooleanType;
import org.obicere.bytecode.core.type.ByteType;
import org.obicere.bytecode.core.type.CharType;
import org.obicere.bytecode.core.type.DoubleType;
import org.obicere.bytecode.core.type.FloatType;
import org.obicere.bytecode.core.type.GenericType;
import org.obicere.bytecode.core.type.IntType;
import org.obicere.bytecode.core.type.LongType;
import org.obicere.bytecode.core.type.ShortType;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.VoidType;
import org.obicere.bytecode.core.type.WildcardIndicator;
import org.obicere.bytecode.core.type.WildcardType;
import org.obicere.bytecode.core.type.signature.ClassTypeSignature;
import org.obicere.bytecode.core.type.signature.ReferenceTypeSignature;
import org.obicere.bytecode.core.type.signature.TypeSignature;
import org.obicere.bytecode.core.type.signature.TypeVariableSignature;

/**
 * @author Obicere
 */
public interface TypeFactory {

    public Type createClassType(final ClassTypeSignature name);

    public ArrayType createArrayType(final TypeSignature type);

    public GenericType createGenericType(final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds);

    public GenericType getGenericType(final TypeVariableSignature name);

    public WildcardType createWildcardType(final WildcardIndicator indicator, final ReferenceTypeSignature bound);

    public BooleanType createBooleanType();

    public ByteType createByteType();

    public ShortType createShortType();

    public CharType createCharType();

    public IntType createIntType();

    public FloatType createFloatType();

    public LongType createLongType();

    public DoubleType createDoubleType();

    public VoidType createVoidType();

}
