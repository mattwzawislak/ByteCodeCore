package org.obicere.bytecode.core.objects.common;

/**
 * @author Obicere
 */
public class Parameter {

    private final String name;
    private final int accessFlags;

    public Parameter(final String name, final int accessFlags){
        this.name = name;
        this.accessFlags = accessFlags;
    }

    public String getName(){
        return name;
    }

    public int getAccessFlags(){
        return accessFlags;
    }

}
