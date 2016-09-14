package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.io.BranchSource;
import org.obicere.bytecode.core.io.LeafSource;

/**
 * @author Obicere
 */
public class TypeSource {

    private final BranchSource base;
    private final LeafSource   file;

    private final String name;

    public TypeSource(final BranchSource base, final LeafSource file, final String name) {
        this.base = base;
        this.file = file;
        this.name = name;
    }

    public BranchSource getBase() {
        return base;
    }

    public LeafSource getFile() {
        return file;
    }

    public String getName() {
        return name;
    }
}
