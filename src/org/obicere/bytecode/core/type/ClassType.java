package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.type.generic.ClassGenericDeclaration;
import org.obicere.bytecode.core.type.generic.GenericDeclarationDeclarer;

/**
 * @author Obicere
 */
public interface ClassType extends ReferenceType, GenericDeclarationDeclarer<ClassGenericDeclaration> {

    public Method[] getMethods();

    public Field[] getFields();

    public ReferenceType getSuperClass();

    public ReferenceType[] getSuperInterfaces();

    public ReferenceType[] getInnerClasses();

    public ReferenceType getOuterClass();

    public GenericType[] getGenericTypes();

}
