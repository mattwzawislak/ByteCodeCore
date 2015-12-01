package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class Attribute extends ByteCodeElement {

    public String getIdentifier() {
        return "attribute" + getStart();
    }

}
