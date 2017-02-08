package org.obicere.bytecode.core.objects.common;

import org.javacore.JCMethod;
import org.javacore.common.BootstrapMethod;
import org.javacore.common.MethodHandle;
import org.javacore.constant.Constant;
import org.javacore.reference.ReferenceKind;

/**
 * @author Obicere
 */
public class DefaultBootstrapMethod implements BootstrapMethod {

    private final MethodHandle<JCMethod> method;

    private final Constant[] arguments;

    public DefaultBootstrapMethod(final MethodHandle<JCMethod> method, final Constant[] arguments) {
        if (method == null) {
            throw new NullPointerException("method must be non-null");
        }
        if (arguments == null) {
            throw new NullPointerException("arguments must be non-null");
        }
        final ReferenceKind kind = method.getReferenceKind();
        if (kind != ReferenceKind.NEW_INVOKE_SPECIAL && kind != ReferenceKind.INVOKE_STATIC) {
            throw new AssertionError("reference kind must be one of invokeStatic (6) or newInvokeSpecial (8)");
        }

        this.method = method;
        this.arguments = arguments;

        // todo verify each object is a valid constant type §4.7.23
    }

    @Override
    public MethodHandle<JCMethod> getMethodHandle() {
        return method;
    }

    @Override
    public Constant[] getArguments() {
        return arguments.clone();
    }
}
