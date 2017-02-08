package org.obicere.bytecode.core.objects.type;

import org.javacore.JCClass;
import org.javacore.type.TypedClass;
import org.javacore.type.WildCardType;

/**
 * @author Obicere
 */
public class DefaultTypedClass implements TypedClass {

    private final WildCardType[] arguments;

    private final JCClass rawType;

    private final TypedClass outerType;

    public DefaultTypedClass(final JCClass rawType, final WildCardType[] arguments, final TypedClass outerType) {
        this.rawType = rawType;
        this.arguments = arguments;
        this.outerType = outerType;
    }

    @Override
    public WildCardType[] getWildcardTypes() {
        return arguments;
    }

    public JCClass getRawType() {
        return rawType;
    }

    @Override
    public TypedClass getGenericOuterClass() {
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
    public boolean isGeneric() {
        return rawType.isGeneric();
    }

    @Override
    public boolean isArray() {
        return rawType.isArray();
    }
}
