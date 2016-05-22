package org.obicere.bytecode.core.objects.target;

/**
 * @author Obicere
 */
public class EmptyTarget implements Target {

    private final int targetType;

    public EmptyTarget(final int targetType){
        this.targetType = targetType;
    }

    @Override
    public int getTargetType() {
        return targetType;
    }
}
