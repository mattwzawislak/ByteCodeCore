package org.obicere.bytecode.core.objects;

import org.javacore.JCMethod;
import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.SignatureAttribute;
import org.obicere.bytecode.core.objects.type.AccessibleTypeFactory;
import org.obicere.bytecode.core.objects.type.DefaultGenericType;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.GenericDeclarationDeclarer;
import org.obicere.bytecode.core.objects.type.generic.MethodGenericDeclaration;
import org.obicere.bytecode.core.objects.type.parser.SignatureParser;
import org.obicere.bytecode.core.objects.type.signature.DefaultMethodSignature;
import org.obicere.bytecode.core.util.ByteCodeReader;

/**
 * @author Obicere
 */
public class DefaultJCMethod implements JCMethod, GenericDeclarationDeclarer<MethodGenericDeclaration> {

    private final int accessFlags;

    private final String name;

    private final String descriptor;

    private final AttributeSet attributeSet;

    private DefaultJCClass outerClass;

    public DefaultJCMethod(final ByteCodeReader reader) {
        reader.enterNode(this);

        reader.exitNode(this);
    }

    public DefaultJCMethod(final int accessFlags, final String name, final String descriptor, final AttributeSet attributeSet) {
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

    public DefaultJCClass getContainingClass() {
        return outerClass;
    }

    public void setContainingClass(final DefaultJCClass cls) {
        this.outerClass = cls;
    }

    public DefaultGenericType[] getGenericTypes() {
        final MethodGenericDeclaration declaration = getDeclaration();
        if (declaration == null) {
            return new DefaultGenericType[0];
        } else {
            return declaration.getGenericTypes();
        }
    }

    private volatile MethodGenericDeclaration declaration;

    private volatile TypeFactory factory;

    private TypeFactory getFactory() {
        if (factory == null) {
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

            final DefaultMethodSignature parsedSignature = parser.parseMethodSignature();
            this.declaration = new MethodGenericDeclaration(this, parsedSignature, getFactory());
        }
        return declaration;
    }
}