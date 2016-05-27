package org.obicere.bytecode.core.io;

/**
 * @author Obicere
 */
public interface BranchSource extends Source {

    default public Source[] getChildren() {
        return getChildren(false);
    }

    public Source[] getChildren(final boolean recursive);

    public Source getChild(final String name);

}
