package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class TypeAnnotation extends Annotation {

    private final int targetType;

    private final Target targetInfo;

    private final TypePath targetPath;

    public TypeAnnotation(final int targetType, final Target targetInfo, final TypePath targetPath, final int typeIndex, final ElementValuePair[] elementValuePairs) {
        super(typeIndex, elementValuePairs);
        if (targetInfo == null) {
            throw new NullPointerException("target info must be non-null");
        }
        if (targetPath == null) {
            throw new NullPointerException("target path must be non-null");
        }
        if (elementValuePairs == null) {
            throw new NullPointerException("element value pairs must be non-null");
        }

        this.targetType = targetType;
        this.targetInfo = targetInfo;
        this.targetPath = targetPath;
    }

    public int getTargetType() {
        return targetType;
    }

    public Target getTargetInfo() {
        return targetInfo;
    }

    public TypePath getTargetPath() {
        return targetPath;
    }
}
