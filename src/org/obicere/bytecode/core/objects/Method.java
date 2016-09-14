package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.Attribute;
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

    private final int nameIndex;

    private final int descriptorIndex;

    private final AttributeSet attributeSet;

    private Class outerClass;

    public Method(final int accessFlags, final int nameIndex, final int descriptorIndex, final Attribute[] attributes) {
        if (attributes == null) {
            throw new NullPointerException("attributes must be non-null");
        }
        this.accessFlags = accessFlags;
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
        this.attributeSet = new AttributeSet(attributes);
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
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

            final SignatureAttribute attribute = getAttributeSet().getAttribute(SignatureAttribute.class);
            if (attribute == null) {
                return null;
            }
            final String signature = outerClass.getConstantPool().getAsString(attribute.getSignatureIndex());

            final SignatureParser parser = new SignatureParser(signature);

            final MethodSignature parsedSignature = parser.parseMethodSignature();
            this.declaration = new MethodGenericDeclaration(this, parsedSignature, getFactory());
        }
        return declaration;
    }
}
