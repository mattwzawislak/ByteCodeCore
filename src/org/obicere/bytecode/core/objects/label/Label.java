package org.obicere.bytecode.core.objects.label;

import org.obicere.bytecode.core.objects.Identifiable;

/**
 * @author Obicere
 */
public interface Label extends Identifiable {

    public int computeOffset(final LabelFactory factory);

}
