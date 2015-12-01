package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.TopVariableInfo;
import org.obicere.bytecode.core.objects.VerificationTypeInfo;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 */
public class TopVariableInfoReader implements Reader<VerificationTypeInfo> {

    @Override
    public VerificationTypeInfo read(final IndexedDataInputStream input) throws IOException {
        return new TopVariableInfo(input.readUnsignedByte());
    }
}
