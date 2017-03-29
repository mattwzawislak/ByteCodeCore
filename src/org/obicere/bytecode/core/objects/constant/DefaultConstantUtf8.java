package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantUtf8;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantUtf8 extends AbstractConstant implements ConstantUtf8 {

    private final String bytes;

    public DefaultConstantUtf8(final String bytes) {
        super(null, Constants.CONSTANT_UTF8);
        if (bytes == null) {
            throw new NullPointerException("bytes must be non-null");
        }
        this.bytes = bytes;
    }


































    @Override
    public String getValue() {
        return bytes;
    }

    @Override
    public String toString() {
        return bytes;
    }
}
