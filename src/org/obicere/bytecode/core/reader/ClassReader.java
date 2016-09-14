package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.attribute.Attribute;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.reader.attribute.AttributeReader;
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
        final int thisClass = input.readUnsignedShort();
        final int superClass = input.readUnsignedShort();

        // read all the interfaces
        final int interfacesCount = input.readUnsignedShort();
        final int[] interfaces = new int[interfacesCount];
        for (int i = 0; i < interfacesCount; i++) {
            interfaces[i] = input.readUnsignedShort();
        }

        final AttributeReader attributeReader = new AttributeReader(constantPool);

        // read all the fields
        final FieldReader fieldReader = new FieldReader(attributeReader);

        final int fieldsCount = input.readUnsignedShort();
        final Field[] fields = new Field[fieldsCount];
        for (int i = 0; i < fieldsCount; i++) {
            fields[i] = fieldReader.read(input);
        }

        // read all the methods
        final MethodReader methodReader = new MethodReader(attributeReader);

        final int methodsCount = input.readUnsignedShort();
        final Method[] methods = new Method[methodsCount];
        for (int i = 0; i < methodsCount; i++) {
            methods[i] = methodReader.read(input);
        }

        // Can't be declared finalized as the constant pool needs to be
        // defined first to access attribute names

        final int attributesCount = input.readUnsignedShort();
        final Attribute[] attributes = new Attribute[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
            attributes[i] = attributeReader.read(input);
        }

        final Class newClass = new Class(minor, major, constantPool, accessFlags, thisClass, superClass, interfaces, fields, methods, attributes);

        for (final Method m : methods) {
            m.setContainingClass(newClass);
        }

        return newClass;
    }

    public ConstantPoolReader getConstantPoolReader() {
        return constantPoolReader;
    }
}
