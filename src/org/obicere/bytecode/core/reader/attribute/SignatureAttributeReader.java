package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.SignatureAttribute;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.attribute.DefaultSignatureAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SignatureAttributeReader implements Reader<SignatureAttribute> {
    @Override
    public SignatureAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final ConstantUtf8 signatureConstant = input.readConstant();
        return new DefaultSignatureAttribute(signatureConstant.getValue());
    }
}
