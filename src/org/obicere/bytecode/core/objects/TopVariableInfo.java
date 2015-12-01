package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 */
public class TopVariableInfo extends VerificationTypeInfo {

    public TopVariableInfo(final int tag) {
        super(tag);
    }

    @Override
    public void model(final DocumentBuilder builder){
        builder.addKeyword("top");
    }
}
