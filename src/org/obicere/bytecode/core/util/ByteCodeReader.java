package org.obicere.bytecode.core.util;

import org.javacore.Identifier;
import org.javacore.code.block.label.Label;
import org.javacore.code.block.label.LabelFactory;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.code.Code;
import org.obicere.bytecode.core.objects.constant.AbstractConstant;
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

    private LabelFactory labelFactory;

    // TODO should this still be required? Is it possible to access through nodes
    private final LinkedList<ConstantPool> constants = new LinkedList<>();

    private final LinkedList<Node> nodes = new LinkedList<>();

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
        this.labelFactory = information.labelFactory;

        this.constants.addAll(information.constants);
    }

    public LabelFactory getLabelFactory() {
        // should really only ever be the top of the stack
        // I should really really really provide better safety here
        final Node node = nodes.peek();
        if (node instanceof Code) {
            return (Code) node;
        } else {
            return null;
        }
    }

    public Label readLabel() throws IOException {
        return readLabel(getIndex());
    }

    public Label readLabel(final int index) throws IOException {
        final short offset = readShort();
        return createLabel(index, offset);
    }

    public Label readWideLabel() throws IOException {
        return readLabel(getIndex());
    }

    public Label readWideLabel(final int index) throws IOException {
        final int offset = readInt();
        return createLabel(index, offset);
    }

    private Label createLabel(final int index, final int offset) {
        if (labelFactory == null) {
            return new OffsetLabel(offset);
        } else {
            return labelFactory.getLabel(index, offset);
        }
    }

    public void enterNode(final Node node) {
        if (node == null) {
            throw new NullPointerException("node must be non-null");
        }
        nodes.push(node);
    }

    public void exitNode(final Node node) {
        final Node removed = nodes.peek();
        if (removed != node) { // should be instance-based
            throw new AssertionError("expected node differs from current node");
        }
        // they are equal, pop off
        nodes.pop();
    }

    public void pushConstants(final ConstantPool constantPool) {
        if (constantPool == null) {
            throw new NullPointerException("constant pool must be non-null.");
        }
        constants.push(constantPool);
    }

    public void pollConstants() {
        constants.poll();
    }

    public ConstantPool getConstantPool() {
        return constants.peek();
    }

    public <C extends AbstractConstant> C readConstant() throws IOException {
        final int index = readUnsignedShort();

        return getConstant(index);
    }

    public <C extends AbstractConstant> C readByteConstant() throws IOException {
        final int index = readUnsignedByte();

        return getConstant(index);
    }

    private <C extends AbstractConstant> C getConstant(final int index) {
        final ConstantPool constantPool = constants.peek();
        if (constantPool == null) {
            throw new NoSuchElementException("have not entered a constant pool yet.");
        }

        return constantPool.get(index);
    }

    public AttributeSet readAttributeSet() throws IOException {
        final int count = readUnsignedShort();
        if (count == 0) {
            return AttributeSet.EMPTY_SET;
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
        return new AttributeSet(this, bytes);
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
