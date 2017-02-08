package org.obicere.bytecode.core.reader;

import org.javacore.Identifier;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class AbstractReaders implements Readers {

    private final Map<Identifier, Reader<?>> readers;

    public AbstractReaders() {
        this.readers = new HashMap<>();
    }

    public AbstractReaders(final Map<Identifier, Reader<?>> readers) {
        this.readers = new HashMap<>(readers);
    }

    public AbstractReaders(final Readers readers) {
        this.readers = new HashMap<>(readers.getReaders());
    }

    @SuppressWarnings("unchecked")
    public <R extends Reader<?>> R getReader(final Identifier identifier) {
        if (identifier == null) {
            throw new NullPointerException("identifier must be non-null");
        }
        final R reader = (R) readers.get(identifier);
        if (reader == null) {
            throw new NullPointerException("no reader for identifier: " + identifier);
        }
        return reader;
    }

    @SuppressWarnings("unchecked")
    public <R extends Reader<?>> R setReader(final Identifier identifier, final R reader) {
        if (identifier == null) {
            throw new NullPointerException("identifier must be non-null");
        }
        return (R) readers.put(identifier, reader);
    }

    @Override
    public Map<Identifier, Reader<?>> getReaders() {
        return readers;
    }
}
