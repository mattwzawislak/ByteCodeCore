package org.obicere.bytecode.core.objects.annotation;

import org.javacore.JCClass;
import org.javacore.annotation.ElementValuePair;
import org.javacore.annotation.TypeAnnotation;
import org.javacore.annotation.path.Path;
import org.javacore.annotation.target.Target;

/**
 * @author Obicere
 */
public class DefaultTypeAnnotation extends DefaultAnnotation implements TypeAnnotation {

    private final int targetType;

    private final Target targetInfo;

    private final Path[] targetPath;

    public DefaultTypeAnnotation(final int targetType, final Target targetInfo, final Path[] targetPath, final JCClass type, final ElementValuePair[] elementValuePairs) {
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

    @Override
    public int getTargetType() {
        return targetType;
    }

    @Override
    public Target getTarget() {
        return targetInfo;
    }

    @Override
    public Path[] getPath() {
        return targetPath;
    }
}
