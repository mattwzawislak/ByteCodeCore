package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.objects.annotation.path.TypePath;
import org.obicere.bytecode.core.objects.annotation.target.Target;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class TypeAnnotation extends Annotation {

    private final int targetType;

    private final Target targetInfo;

    private final TypePath targetPath;

    public TypeAnnotation(final int targetType, final Target targetInfo, final TypePath targetPath, final Type type, final ElementValuePair[] elementValuePairs) {
        super(type, elementValuePairs);
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
