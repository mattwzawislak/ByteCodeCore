package org.obicere.bytecode.core.reader;

import org.javacore.Identifier;
import org.javacore.JCClass;
import org.javacore.JCField;
import org.javacore.JCMethod;
import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.objects.DefaultJCClass;
import org.obicere.bytecode.core.objects.attribute.Attributes;
import org.obicere.bytecode.core.objects.constant.DefaultConstantPool;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class JCClassReader implements Reader<JCClass> {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    @Override
    public JCClass read(final ByteCodeReader input) throws IOException {
        final JCClass jcClass = new DefaultJCClass();

        input.enterParent(jcClass);

        final int magic = input.readInt();
        if (magic != MAGIC_NUMBER) {
            throw new ClassFormatError("invalid magic number constant: " + magic);
        }

        final int minorVersion = input.readUnsignedShort();
        final int majorVersion = input.readUnsignedShort();

        // should push the constantPool onto the stack
        // (it is needed for other constants, so we can't do it here)
        final ConstantPool constantPool = input.read(Identifier.CONSTANT_POOL);

        final int accessFlags = input.readUnsignedShort();
        final ConstantClass constantName = input.readConstant();
        final ConstantClass constantSuperName = input.readConstant();
        final String thisName = constantName.getName();

        final String superName;
        // superName may be null
        if (constantSuperName == null) {
            // for java.lang.Object only
            if (!thisName.equals("java/lang/Object")) {
                throw new NullPointerException("super class must be non-null");
            }
            superName = null;
        } else {
            superName = constantSuperName.getName();
        }

        // read all the interfaces
        final int interfacesCount = input.readUnsignedShort();
        final String[] interfaces = new String[interfacesCount];
        for (int i = 0; i < interfacesCount; i++) {
            final ConstantClass constantInterfaceName = input.readConstant();
            interfaces[i] = constantInterfaceName.getName();
        }

        // read all the fields
        final int fieldsCount = input.readUnsignedShort();
        final JCField[] fields = new JCField[fieldsCount];
        for (int i = 0; i < fieldsCount; i++) {
            fields[i] = input.read(Identifier.FIELD);
        }

        // read all the methods
        final int methodsCount = input.readUnsignedShort();
        final JCMethod[] methods = new JCMethod[methodsCount];
        for (int i = 0; i < methodsCount; i++) {
            methods[i] = input.read(Identifier.METHOD);
        }

        final Attributes attributes = input.readAttributeSet();

        jcClass.setMinorVersion(minorVersion);
        jcClass.setMajorVersion(majorVersion);
        jcClass.setAccessFlags(accessFlags);
        jcClass.setName(name);
        jcClass.setSuperName(superName);
        jcClass.setInterfaces(interfaces);
        jcClass.setFields(fields);
        jcClass.setMethods(methods);
        jcClass.setAttributes(attributes);

        // reading the constant pool will push it into the stack
        // at this point, we can pop it off
        input.pollConstants(constantPool);
        input.exitParent(jcClass);

        return jcClass;
    }
}
