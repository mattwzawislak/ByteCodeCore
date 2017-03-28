package org.obicere.bytecode.core.util;

import org.javacore.Attributable;
import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.Code;
import org.javacore.code.block.label.Label;
import org.javacore.constant.Constant;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.objects.attribute.Attributes;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.Readers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author Obicere
 */
public class ByteCodeReader extends IndexedDataInputStream {

    // TODO should this still be required? Is it possible to access through path
    private final LinkedList<ConstantPool> constants = new LinkedList<>();

    private final LinkedList<Attributable> path = new LinkedList<>();

    private final Readers readers;

    public ByteCodeReader(final Readers readers, final InputStream stream) {
        this(readers, stream, 0);
    }

    public ByteCodeReader(final Readers readers, final InputStream stream, final int offset) {
        super(stream, offset);

        this.readers = readers;
    }

    public ByteCodeReader(final Readers readers, final byte[] bytes) {
        this(readers, 0, bytes);
    }

    public ByteCodeReader(final Readers readers, final int offset, final byte[] bytes) {
        super(offset, bytes);

        this.readers = readers;
    }

    public ByteCodeReader(final ByteCodeReader information, final byte[] bytes) {
        super(bytes);
        this.readers = information.readers;

        this.path.addAll(information.path);
        this.constants.addAll(information.constants);
    }

    public Label readLabel() throws IOException {
        return readLabel(getIndex());
    }

    public Label readLabel(final int index) throws IOException {
        final short offset = readShort();
        return createLabel(index, offset);
    }

    public Label readLabel(final Label label) throws IOException {
        final short offset = readShort();
        return createLabel(label.getAddress(), offset);
    }

    public Label readWideLabel() throws IOException {
        return readLabel(getIndex());
    }

    public Label readWideLabel(final int index) throws IOException {
        final int offset = readInt();
        return createLabel(index, offset);
    }

    private Label createLabel(final int index, final int offset) {
        final Code code = (Code) getParent(Identifier.CODE);
        return code.getLabel(index + offset);
    }

    public Attributable getParent(final Identifier type) {
        for (final Attributable element : path) {
            if (element.getIdentifier() == type) {
                return element;
            }
        }
        return null;
    }

    public void enterParent(final Attributable element) {
        if (element == null) {
            throw new NullPointerException("element must be non-null");
        }
        path.push(element);
    }

    public void exitParent(final Attributable element) {
        final Attributable expected = path.peek();
        if (expected != element) { // should be instance-based
            throw new AssertionError("expected element differs from current element");
        }
        // they are equal, pop off
        path.pop();
    }

    public void pushConstants(final ConstantPool constantPool) {
        if (constantPool == null) {
            throw new NullPointerException("constant pool must be non-null.");
        }
        constants.push(constantPool);
    }

    public void pollConstants(final ConstantPool constantPool) {
        final ConstantPool expected = constants.poll();
        if(expected != constantPool) {
            throw new AssertionError("expected element differs from current element");
        }
        path.pop();
    }

    public ConstantPool getConstantPool() {
        return constants.peek();
    }

    public <C extends Constant> C readConstant() throws IOException {
        final int index = readUnsignedShort();

        return getConstant(index);
    }

    public <C extends Constant> C readByteConstant() throws IOException {
        final int index = readUnsignedByte();

        return getConstant(index);
    }

    @SuppressWarnings("unchecked")
    private <C extends Constant> C getConstant(final int index) {
        final ConstantPool constantPool = constants.peek();
        if (constantPool == null) {
            throw new NoSuchElementException("have not entered a constant pool yet.");
        }

        return (C) constantPool.get(index);
    }

    public Attributes readAttributeSet() throws IOException {
        final int count = readUnsignedShort();
        if (count == 0) {
            return Attributes.EMPTY_SET;
        }
        final ByteArrayOutputStream attributes = new ByteArrayOutputStream();
        final DataOutputStream helper = new DataOutputStream(attributes);

        helper.writeShort(count);
        for (int i = 0; i < count; i++) {
            final int nameIndex = readUnsignedShort();
            final int length = readInt();
            final byte[] data = new byte[length];

            if (read(data) < 0) {
                throw new IOException("end of stream");
            }

            helper.writeShort(nameIndex);
            helper.writeInt(length);
            helper.write(data);
        }

        attributes.close();
        helper.close();

        final byte[] bytes = attributes.toByteArray();
        return new Attributes(this, bytes);
    }

    @SuppressWarnings("unchecked")
    public <T extends Identifiable> T read(final Identifier identifier) throws IOException {
        if (identifier == null) {
            throw new NullPointerException("identifier must be non-null");
        }
        final Reader<T> reader = readers.getReader(identifier);
        if (reader == null) {
            throw new NoSuchElementException("no reader for reader: " + identifier);
        }
        return reader.read(this);
    }
}
