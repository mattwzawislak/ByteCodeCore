package org.obicere.bytecode.core.objects.code.block.label;

import org.obicere.bytecode.core.Identifiable;

/**
 * @author Obicere
 */
public interface Label extends Identifiable {

    public int computeOffset(final LabelFactory factory);

}
