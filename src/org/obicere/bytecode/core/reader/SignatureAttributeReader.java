package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.SignatureAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SignatureAttributeReader implements Reader<SignatureAttribute> {
    @Override
    public SignatureAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int signatureIndex = input.readUnsignedShort();
        return new SignatureAttribute(length, signatureIndex);
    }
}
