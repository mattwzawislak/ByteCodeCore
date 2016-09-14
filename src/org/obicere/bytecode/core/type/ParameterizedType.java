package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public class ParameterizedType implements ReferenceType {

    private final WildcardType[] arguments;

    private final ClassType rawType;

    private final ReferenceType outerType;

    public ParameterizedType(final ClassType rawType, final WildcardType[] arguments, final ReferenceType outerType) {
        this.rawType = rawType;
        this.arguments = arguments;
        this.outerType = outerType;
    }

    public WildcardType[] getActualTypeArguments() {
        return arguments;
    }

    public ClassType getRawType() {
        return rawType;
    }

    public ReferenceType getOuterType() {
        return outerType;
    }

    @Override
    public String getName() {
        return rawType.getName();
    }

    @Override
    public String getSimpleName() {
        return rawType.getSimpleName();
    }

    @Override
    public String getCanonicalName() {
        return rawType.getCanonicalName();
    }

    @Override
    public boolean isPrimitive() {
        return rawType.isPrimitive();
    }

    @Override
    public boolean isGeneric() {
        return rawType.isGeneric();
    }

    @Override
    public boolean isArray() {
        return rawType.isArray();
    }
}
