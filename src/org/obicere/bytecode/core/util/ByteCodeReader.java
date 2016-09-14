package org.obicere.bytecode.core.util;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.block.label.LabelFactory;
import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.objects.code.block.label.OffsetLabel;
import org.obicere.bytecode.core.objects.constant.Constant;
import org.obicere.bytecode.core.objects.constant.ConstantPool;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/**
 * @author Obicere
 */
public class ByteCodeReader extends IndexedDataInputStream {

    private LabelFactory labelFactory;

    private final LinkedList<ConstantPool> constants;

    public ByteCodeReader(final InputStream stream) {
        this(stream, 0);
    }

    public ByteCodeReader(final InputStream stream, final int offset) {
        super(stream, offset);

        this.constants = new LinkedList<>();
    }

    public ByteCodeReader(final byte[] bytes) {
        this(0, bytes);
    }

    public ByteCodeReader(final int offset, final byte[] bytes) {
        super(offset, bytes);

        this.constants = new LinkedList<>();
    }

    public ByteCodeReader(final ByteCodeReader information, final byte[] bytes) {
        super(bytes);
        this.labelFactory = information.labelFactory;
        this.constants = new LinkedList<>(information.constants);
    }

    public void setLabelFactory(final LabelFactory labelFactory) {
        this.labelFactory = labelFactory;
    }

    public LabelFactory getLabelFactory() {
        return labelFactory;
    }

    public LazyLabel readLazyLabel() throws IOException {
        return new LazyLabel(readShort());
    }

    public LazyLabel readWideLazyLabel() throws IOException {
        return new LazyLabel(readInt());
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

    public <C extends Constant> C readConstant() throws IOException {
        final int index = readUnsignedShort();

        return getConstant(index);
    }

    public <C extends Constant> C readByteConstant() throws IOException {
        final int index = readUnsignedByte();

        return getConstant(index);
    }

    private <C extends Constant> C getConstant(final int index) {
        final ConstantPool constantPool = constants.peek();
        if (constantPool == null) {
            return null;
        }

        return constantPool.get(index);
    }
}
