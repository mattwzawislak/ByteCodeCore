package org.obicere.bytecode.core.objects;

import org.javacore.JCClass;
import org.javacore.JCMethod;
import org.javacore.annotation.Annotation;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.CodeAttribute;
import org.javacore.attribute.DeprecatedAttribute;
import org.javacore.attribute.SignatureAttribute;
import org.javacore.attribute.SyntheticAttribute;
import org.javacore.code.Code;
import org.javacore.type.GenericType;
import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.MethodGenericDeclaration;
import org.javacore.type.signature.MethodSignature;
import org.obicere.bytecode.core.objects.attribute.Attributes;
import org.obicere.bytecode.core.objects.type.factory.DefaultTypeFactory;
import org.obicere.bytecode.core.objects.type.generic.DefaultMethodGenericDeclaration;
import org.obicere.bytecode.core.objects.type.parser.SignatureParser;
import org.obicere.bytecode.core.util.ByteCodeReader;

/**
 * @author Obicere
 */
public class DefaultJCMethod implements JCMethod {

    private int accessFlags;

    private String name;

    private String descriptor;

    private Attributes attributes;

    private JCClass outerClass;

    private MethodGenericDeclaration declaration;

    private TypeFactory factory;

    // code information

    private Code code;

    // exceptions information

    private Type[] exceptions;

    // parameter annotations

    // TODO should these be stored with the parameters? probably
    private Annotation[][] parameterAnnotations;

    // annotation default value
    // only for methods in annotation interfaces
    private Object defaultValue;

    // synthetic

    private boolean synthetic;

    // deprecated

    private boolean deprecated;

    // signature information

    private Type returnType;

    // TODO is this necessary
    // erased types of each parameter
    private Type[] parameterTypes;

    // TODO is this necessary
    // erased types of each exception
    private Type[] exceptionTypes;

    // runtime visible/invisible annotations

    private Annotation[] annotations;

    public DefaultJCMethod(final ByteCodeReader reader) {
        reader.enterParent(this);

        reader.exitParent(this);
    }

    public DefaultJCMethod(final int accessFlags, final String name, final String descriptor, final Attributes attributes) {
        this.accessFlags = accessFlags;
        this.name = name;
        this.descriptor = descriptor;
        this.attributes = attributes;
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getReturnType() {
        if (returnType == null) {
            initializeSignature();
        }
        return returnType;
    }

    @Override
    public Type[] getParameterTypes() {
        if (parameterTypes == null) {
            initializeSignature();
        }
        return parameterTypes;
    }

    @Override
    public Type[] getExceptionTypes() {
        if (exceptions == null) {
            initializeSignature();
        }
        return exceptions;
    }

    private void initializeSignature() {
        final MethodGenericDeclaration declaration = getDeclaration();

        this.returnType = declaration.getReturnType();
        this.parameterTypes = declaration.getParameterTypes();
        this.exceptions = declaration.getExceptionTypes();
    }

    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public JCClass getDeclaringClass() {
        return outerClass;
    }

    @Override
    public void setDeclaringClass(final JCClass cls) {
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

    private TypeFactory getFactory() {
        if (factory == null) {
            factory = new DefaultTypeFactory(this);
        }
        return factory;
    }

    @Override
    public MethodGenericDeclaration getDeclaration() {
        if (declaration == null) {
            final String signature;

            final SignatureAttribute attribute = attributes.getAttribute(SignatureAttribute.class);
            if (attribute == null) {
                signature = this.descriptor;
            } else {
                signature = attribute.getSignature();
                attributes.removeAttributes(SignatureAttribute.class);
            }

            final SignatureParser parser = new SignatureParser(signature);
            final MethodSignature parsedSignature = parser.parseMethodSignature();
            this.declaration = new DefaultMethodGenericDeclaration(this, parsedSignature, getFactory());
        }
        return declaration;
    }

    public Code getCode() {
        if (code == null) {
            final CodeAttribute attribute = attributes.getAttribute(CodeAttribute.class);
            if (attribute == null) {
                return null;
            }
            attributes.removeAttributes(CodeAttribute.class);
            this.code = attribute.getCode();
        }
        return code;
    }

    public void setCode(final Code code) {
        this.code = code;
    }

    public boolean isDeprecated() {
        final DeprecatedAttribute attribute = attributes.getAttribute(DeprecatedAttribute.class);
        if (attribute != null) {
            deprecated = true;
            attributes.removeAttributes(DeprecatedAttribute.class);
        }
        return deprecated;
    }

    public void setDeprecated(final boolean deprecated) {
        this.deprecated = deprecated;
    }

    public boolean isSynthetic() {
        final SyntheticAttribute attribute = attributes.getAttribute(SyntheticAttribute.class);
        if (attribute != null) {
            synthetic = true;
            attributes.removeAttributes(SyntheticAttribute.class);
        }
        return synthetic;
    }

    public void setSynthetic(final boolean synthetic) {
        this.synthetic = synthetic;
    }

    @Override
    public Attribute[] getAttributes() {
        return new Attribute[0];
    }
}
