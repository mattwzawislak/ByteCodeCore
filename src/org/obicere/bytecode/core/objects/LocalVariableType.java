package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.objects.label.LabelFactory;
import org.obicere.bytecode.core.objects.label.LazyLabel;

/**
 * @author Obicere
 */
public class LocalVariableType implements Identifiable {

    public static final String IDENTIFIER = "LocalVariableType";

    private final LazyLabel start;
    private final LazyLabel end;
    private final int nameIndex;
    private final int signatureIndex;
    private final int index;

    public LocalVariableType(final LazyLabel start, final LazyLabel end, final int nameIndex, final int signatureIndex, final int index){
        this.start = start;
        this.end = end;
        this.nameIndex = nameIndex;
        this.signatureIndex = signatureIndex;
        this.index = index;
    }

    public void initializeLabels(final LabelFactory factory) {
        start.initialize(factory);
        end.initialize(factory);
    }

    public Label getStart() {
        return start;
    }

    public Label getEnd() {
        return end;
    }

    public int getSignatureIndex() {
        return signatureIndex;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
