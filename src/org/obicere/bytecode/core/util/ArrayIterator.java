package org.obicere.bytecode.core.util;

import java.util.Iterator;

/**
 */
public class ArrayIterator<T> implements Iterator<T> {

    private int index;

    private int endIndex;

    private final T[] array;

    public ArrayIterator(final T[] array) {
        this(array, 0, array.length);
    }

    public ArrayIterator(final T[] array, final int start, final int length) {
        if (array == null) {
            throw new NullPointerException("array must be non-null");
        }
        if (start < 0) {
            throw new IllegalArgumentException("start must be non-negative");
        }
        if (endIndex < 0) {
            throw new IllegalArgumentException("end must be non-negative");
        }
        this.index = start;
        this.endIndex = start + length;
        this.array = array;

        if (endIndex > array.length) {
            throw new IllegalArgumentException("end index out of bounds");
        }
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
