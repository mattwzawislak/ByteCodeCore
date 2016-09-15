package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.reader.constant.ConstantPoolReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ClassReader implements Reader<Class> {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    private final ConstantPoolReader constantPoolReader = new ConstantPoolReader();

    @Override
    public Class read(final ByteCodeReader input) throws IOException {
        final int magic = input.readInt();
        if (magic != MAGIC_NUMBER) {
            throw new ClassFormatError("invalid magic number constant: " + magic);
        }

        final int minor = input.readUnsignedShort();
        final int major = input.readUnsignedShort();

        final ConstantPool constantPool = constantPoolReader.read(input);

        final int accessFlags = input.readUnsignedShort();
        final ConstantClass constantName = input.readConstant();
        final ConstantClass constantSuperName = input.readConstant();
        final String thisName = constantName.getName();

        final String superName;
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
        final FieldReader fieldReader = new FieldReader();

        final int fieldsCount = input.readUnsignedShort();
        final Field[] fields = new Field[fieldsCount];
        for (int i = 0; i < fieldsCount; i++) {
            fields[i] = fieldReader.read(input);
        }

        // read all the methods
        final MethodReader methodReader = new MethodReader();

        final int methodsCount = input.readUnsignedShort();
        final Method[] methods = new Method[methodsCount];
        for (int i = 0; i < methodsCount; i++) {
            methods[i] = methodReader.read(input);
        }

        final AttributeSet attributeSet = input.readAttributeSet();

        final Class newClass = new Class(minor, major, constantPool, accessFlags, thisName, superName, interfaces, fields, methods, attributeSet);

        for (final Method m : methods) {
            m.setContainingClass(newClass);
        }

        input.pollConstants();
        return newClass;
    }

    public ConstantPoolReader getConstantPoolReader() {
        return constantPoolReader;
    }
}
