package org.obicere.bytecode.core.objects.common;

import org.javacore.JCMethod;
import org.javacore.common.BootstrapMethod;
import org.javacore.common.BootstrapMethodLink;
import org.javacore.reference.Reference;

/**
 */
public class DefaultBootstrapMethodLink implements BootstrapMethodLink {

    private final BootstrapMethod     method;
    private final Reference<JCMethod> implementation;

    public DefaultBootstrapMethodLink(final BootstrapMethod method, final Reference<JCMethod> implementation) {
        this.method = method;
        this.implementation = implementation;
    }

    @Override
    public BootstrapMethod getBootstrapMethod() {
        return method;
    }

    @Override
    public Reference<JCMethod> getImplementation() {
        return implementation;
    }
}
