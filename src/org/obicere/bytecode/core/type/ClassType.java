package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.type.generic.TypeArgument;

/**
 * @author Obicere
 */
public interface ClassType extends Type {

    public Method[] getMethods();

    public Field[] getFields();

    public ClassType getSuperClass();

    public ClassType[] getSuperInterfaces();

    public ClassType[] getInnerClasses();

    public ClassType getOuterClass();

    public Type getResolvedType();

    public boolean isResolved();

    public TypeArgument[] getTypeArguments();

}
