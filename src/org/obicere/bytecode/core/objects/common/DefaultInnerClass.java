package org.obicere.bytecode.core.objects.common;

import org.javacore.common.InnerClass;

/**
 * @author Obicere
 */
public class DefaultInnerClass implements InnerClass {

    private final String innerClassInfo;
    private final String outerClassInfo;
    private final String innerName;

    private final int innerClassAccessFlags;

    public DefaultInnerClass(final String innerClassInfo, final String outerClassInfo, final String innerName, final int innerClassAccessFlags) {
        this.innerClassInfo = innerClassInfo;
        this.outerClassInfo = outerClassInfo;
        this.innerName = innerName;
        this.innerClassAccessFlags = innerClassAccessFlags;
    }

    @Override
    public String getInnerClassInfo() {
        return innerClassInfo;
    }

    @Override
    public String getOuterClassInfo() {
        return outerClassInfo;
    }

    @Override
    public String getInnerName() {
        return innerName;
    }

    @Override
    public int getInnerClassAccessFlags() {
        return innerClassAccessFlags;
    }
}
