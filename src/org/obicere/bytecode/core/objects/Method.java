package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.SignatureAttribute;
import org.obicere.bytecode.core.type.AccessibleTypeFactory;
import org.obicere.bytecode.core.type.GenericType;
import org.obicere.bytecode.core.type.generation.TypeFactory;
import org.obicere.bytecode.core.type.generic.GenericDeclarationDeclarer;
import org.obicere.bytecode.core.type.generic.MethodGenericDeclaration;
import org.obicere.bytecode.core.type.parser.SignatureParser;
import org.obicere.bytecode.core.type.signature.MethodSignature;

/**
 * @author Obicere
 */
public final class Method implements Identifiable, GenericDeclarationDeclarer<MethodGenericDeclaration> {

    public static final String IDENTIFIER = "Method";

    private final int accessFlags;

    private final String name;

    private final String descriptor;

    private final AttributeSet attributeSet;

    private Class outerClass;

    public Method(final int accessFlags, final String name, final String descriptor, final AttributeSet attributeSet) {
        this.accessFlags = accessFlags;
        this.name = name;
        this.descriptor = descriptor;
        this.attributeSet = attributeSet;
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    public String getName() {
        return name;
    }

    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    public Class getContainingClass() {
        return outerClass;
    }

    public void setContainingClass(final Class cls) {
        this.outerClass = cls;
    }

    public GenericType[] getGenericTypes() {
        final MethodGenericDeclaration declaration = getDeclaration();
        if (declaration == null) {
            return new GenericType[0];
        } else {
            return declaration.getGenericTypes();
        }
    }

    private volatile MethodGenericDeclaration declaration;

    private volatile TypeFactory factory;

    private TypeFactory getFactory() {
        if(factory == null){
            factory = new AccessibleTypeFactory(this);
        }
        return factory;
    }

    @Override
    public MethodGenericDeclaration getDeclaration() {
        if (declaration == null) {

            final SignatureAttribute attribute = attributeSet.getAttribute(SignatureAttribute.class);
            if (attribute == null) {
                return null;
            }
            final String signature = attribute.getSignature();

            final SignatureParser parser = new SignatureParser(signature);

            final MethodSignature parsedSignature = parser.parseMethodSignature();
            this.declaration = new MethodGenericDeclaration(this, parsedSignature, getFactory());
        }
        return declaration;
    }
}
