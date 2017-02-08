package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.EmptyTarget;

/**
 * @author Obicere
 */
public class DefaultEmptyTarget extends AbstractTarget implements EmptyTarget {

    public DefaultEmptyTarget(final int targetType){
        super(targetType);
    }
}
