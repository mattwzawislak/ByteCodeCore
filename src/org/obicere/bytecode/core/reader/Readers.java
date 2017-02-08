package org.obicere.bytecode.core.reader;

import org.javacore.Identifier;

import java.util.Map;

/**
 */
public interface Readers {

    public <R extends Reader<?>> R getReader(final Identifier identifier);

    public <R extends Reader<?>> R setReader(final Identifier identifier, final R reader);

    public Map<Identifier, Reader<?>> getReaders();

}
