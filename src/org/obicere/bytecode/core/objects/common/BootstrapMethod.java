package org.obicere.bytecode.core.objects.common;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.constant.Constant;
import org.obicere.bytecode.core.objects.reference.ReferenceKind;

/**
 * @author Obicere
 */
public class BootstrapMethod implements Identifiable {

    public static final String IDENTIFIER = "BootstrapMethod";

    private final MethodHandle<Method> method;

    private final Constant[] arguments;

    public BootstrapMethod(final MethodHandle<Method> method, final Constant[] arguments) {
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

    public MethodHandle<Method> getMethodHandle() {
        return method;
    }

    public Constant[] getArguments() {
        return arguments.clone();
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
