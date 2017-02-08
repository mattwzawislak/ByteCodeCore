package org.obicere.bytecode.core.objects.constant;

import org.javacore.Identifier;
import org.javacore.constant.Constant;
import org.javacore.constant.ConstantPool;
import org.obicere.bytecode.core.reader.constant.ConstantReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * TODO: in the event the constant pool gets overflowed, do this:
 * <p>
 * if (index >= CONSTANT_POOL_MAX_INDEX) {
 * throw new InternalError("WHAT THE FUCK ARE YOU DOING?! Like seriously,
 * this file is way too big. You managed to allocate 65,535 unique entries
 * into the constant pool and you still want more? Believe it or not you
 * can use multiple classes in Java, you fucking dipshit. You don't need
 * to
 * write your entire fucking framework in one class. Like how big is this
 * shit anyway? Are you trying to get a rocket to the fucking Andromeda
 * galaxy? You can fuck right off, Elon Musk. I don't give a shit if you
 * want this all in one class, you can't have it. Boo-fucking-hoo. Go back
 * to python you degenerate piece of shit.");
 * }
 *
 * @author Obicere
 */
public class DefaultConstantPool implements ConstantPool {

    // sloppy af
    public static final String NULL_ENTRY = "<null entry>";

    private Constant[] constants;

    public DefaultConstantPool(final ByteCodeReader reader) throws IOException {
        reader.pushConstants(this);

        final int constantPoolCount = reader.readUnsignedShort();
        final Constant[] constants = new AbstractConstant[constantPoolCount];

        // index 0 is reserved for compiler usage
        for (int i = 1; i < constantPoolCount; i++) {
            final Constant next = reader.read(Identifier.CONSTANT);

            constants[i] = next;

            final int tag = next.getTag();
            // "In retrospect, making 8-byte constants take two constant pool entries was a poor choice."
            //    ~ Someone who had a bit of sense

            // Why they did this still shocks me.
            if (tag == ConstantReader.CONSTANT_LONG || tag == ConstantReader.CONSTANT_DOUBLE) {
                i++;
            }
        }
        this.constants = constants;
    }

    public DefaultConstantPool(final Constant[] constants) {
        this.constants = constants;
    }

    @Override
    public Constant get(final int i) {
        if (i >= constants.length) {
            return null;
        }
        return constants[i];
    }

    @Override
    public Constant[] getConstants() {
        return constants;
    }

    public void setConstants(final AbstractConstant[] constants) {
        this.constants = constants;
    }

    @SuppressWarnings("unchecked")
    public <C extends Constant> C getAs(final int index) {
        if (index >= constants.length) {
            return null;
        }
        return (C) constants[index];
    }

    public String getAsString(final int index) {
        final Constant constant = get(index);
        if (constant == null) {
            return NULL_ENTRY;
        }
        return constant.toString();
    }
}
