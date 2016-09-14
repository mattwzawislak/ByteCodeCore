package org.obicere.bytecode.core.objects.code.block;

/**
 * @author Obicere
 */
public class ImplicitCodeBlock extends CodeBlock {

    public static final String IDENTIFIER = "ImplicitCodeBlock";

    @Override
    public int getStartPC() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
