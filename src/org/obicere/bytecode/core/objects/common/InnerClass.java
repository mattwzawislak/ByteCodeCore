package org.obicere.bytecode.core.objects.common;

import org.obicere.bytecode.core.Identifiable;

/**
 * @author Obicere
 */
public class InnerClass implements Identifiable {

    public static final String IDENTIFIER = "InnerClass";

    private final String innerClassInfo;
    private final String outerClassInfo;
    private final String innerName;

    private final int innerClassAccessFlags;

    public InnerClass(final String innerClassInfo, final String outerClassInfo, final String innerName, final int innerClassAccessFlags) {
        this.innerClassInfo = innerClassInfo;
        this.outerClassInfo = outerClassInfo;
        this.innerName = innerName;
        this.innerClassAccessFlags = innerClassAccessFlags;
    }

    public String getInnerClassInfo() {
        return innerClassInfo;
    }

    public String getOuterClassInfo() {
        return outerClassInfo;
    }

    public String getInnerName() {
        return innerName;
    }

    public int getInnerClassAccessFlags() {
        return innerClassAccessFlags;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
