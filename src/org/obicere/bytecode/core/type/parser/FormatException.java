package org.obicere.bytecode.core.type.parser;

/**
 * @author Obicere
 */
public class FormatException extends RuntimeException {

    public FormatException(final String message, final QueueString string){
        super(message + ", remainder: " + string.toString());
    }

}
