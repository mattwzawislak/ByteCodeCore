package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class Parameter {

    private final int nameIndex;
    private final int accessFlags;

    public Parameter(final int nameIndex, final int accessFlags){
        this.nameIndex = nameIndex;
        this.accessFlags = accessFlags;
    }

    public int getNameIndex(){
        return nameIndex;
    }

    public int getAccessFlags(){
        return accessFlags;
    }

}
