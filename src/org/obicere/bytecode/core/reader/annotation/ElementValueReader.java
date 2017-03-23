package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.ElementValue;
import org.obicere.bytecode.core.reader.MultiReader;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ElementValueReader extends MultiReader<Integer, ElementValue> {

    public static final int TAG_BYTE       = 'B';
    public static final int TAG_CHARACTER  = 'C';
    public static final int TAG_DOUBLE     = 'D';
    public static final int TAG_FLOAT      = 'F';
    public static final int TAG_INTEGER    = 'I';
    public static final int TAG_LONG       = 'J';
    public static final int TAG_SHORT      = 'S';
    public static final int TAG_BOOLEAN    = 'Z';
    public static final int TAG_STRING     = 's';
    public static final int TAG_ENUM       = 'e';
    public static final int TAG_CLASS      = 'c';
    public static final int TAG_ANNOTATION = '@';
    public static final int TAG_ARRAY      = '[';

    public ElementValueReader() {
        add(TAG_BYTE, new ByteElementValueReader());
        add(TAG_CHARACTER, new CharacterElementValueReader());
        add(TAG_DOUBLE, new DoubleElementValueReader());
        add(TAG_FLOAT, new FloatElementValueReader());
        add(TAG_INTEGER, new IntegerElementValueReader());
        add(TAG_LONG, new LongElementValueReader());
        add(TAG_SHORT, new ShortElementValueReader());
        add(TAG_BOOLEAN, new BooleanElementValueReader());
        add(TAG_STRING, new StringElementValueReader());
        add(TAG_ENUM, new EnumElementValueReader());
        add(TAG_CLASS, new ClassElementValueReader());
        add(TAG_ANNOTATION, new AnnotationElementValueReader());
        add(TAG_ARRAY, new ArrayElementValueReader());
    }

    @Override
    public ElementValue read(final ByteCodeReader input) throws IOException {
        final int tag = input.readUnsignedByte();
        final Reader<? extends ElementValue> reader = get(tag);
        if (reader == null) {
            throw new IllegalStateException("no element value reader found for tag: " + tag);
        }
        return reader.read(input);
    }
}
