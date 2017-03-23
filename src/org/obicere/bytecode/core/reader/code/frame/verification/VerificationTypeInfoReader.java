package org.obicere.bytecode.core.reader.code.frame.verification;

import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.MultiReader;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class VerificationTypeInfoReader extends MultiReader<Integer, VerificationTypeInfo> {

    public static final int ITEM_TOP                = 0;
    public static final int ITEM_INTEGER            = 1;
    public static final int ITEM_FLOAT              = 2;
    public static final int ITEM_DOUBLE             = 3;
    public static final int ITEM_LONG               = 4;
    public static final int ITEM_NULL               = 5;
    public static final int ITEM_UNINITIALIZED_THIS = 6;
    public static final int ITEM_OBJECT             = 7;
    public static final int ITEM_UNINITIALIZED      = 8;

    public VerificationTypeInfoReader() {
        add(ITEM_TOP, new TopVariableInfoReader());
        add(ITEM_INTEGER, new IntegerVariableInfoReader());
        add(ITEM_FLOAT, new FloatVariableInfoReader());
        add(ITEM_DOUBLE, new DoubleVariableInfoReader());
        add(ITEM_LONG, new LongVariableInfoReader());
        add(ITEM_NULL, new NullVariableInfoReader());
        add(ITEM_UNINITIALIZED_THIS, new UninitializedThisVariableInfoReader());
        add(ITEM_OBJECT, new ObjectVariableInfoReader());
        add(ITEM_UNINITIALIZED, new UninitializedVariableInfoReader());
    }

    @Override
    public VerificationTypeInfo read(final ByteCodeReader input) throws IOException {
        final int type = input.readUnsignedByte();
        final Reader<? extends VerificationTypeInfo> reader = get(type);

        if(reader == null){
            throw new IllegalArgumentException("No reader for input: " + type);
        }

        return reader.read(input);
    }
}
