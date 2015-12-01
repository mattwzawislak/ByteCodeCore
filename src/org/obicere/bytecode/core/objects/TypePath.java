package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class TypePath {

    private final Path[] path;

    public TypePath(final Path[] path){
        this.path = path;
    }

    public Path[] getPath(){
        return path;
    }

}
