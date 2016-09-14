package org.obicere.bytecode.core.type.signature;

/**
 * @author Obicere
 */
public class SimpleClassTypeSignature {

    private final String identifier;
    private final TypeArgument[] arguments;

    public SimpleClassTypeSignature(final String identifier, final TypeArgument[] arguments){
        this.identifier = identifier;
        this.arguments = arguments;
    }

    public String getIdentifier(){
        return identifier;
    }

    public TypeArgument[] getArguments(){
        return arguments;
    }

}
