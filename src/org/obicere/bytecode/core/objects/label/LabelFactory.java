package org.obicere.bytecode.core.objects.label;

import org.obicere.bytecode.core.objects.CodeBlock;

/**
 * @author Obicere
 */
public interface LabelFactory {

    public int getIndexOf(final CodeBlock block);

    default public int getIndexOf(final Label label) {
        return label.computeOffset(this);
    }

    public Label getLabel(final int pc, final int offset);

    public Label getOffsetLabel(final int offset);

    public int getCodeSize();

}
