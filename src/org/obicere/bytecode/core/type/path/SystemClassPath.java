package org.obicere.bytecode.core.type.path;

/**
 * @author Obicere
 */
final class SystemClassPath extends AbstractClassPath {

    private static final ClassPath INSTANCE = new SystemClassPath();

    public SystemClassPath() {
        final String javaClassPath = System.getProperty("java.class.path");
        final String sunClassPath = System.getProperty("sun.boot.class.path");
        final String extensions = System.getProperty("java.ext.dirs");

        addPackages(javaClassPath);
        addPackages(sunClassPath);
        addExtensions(extensions);
    }

    public static ClassPath getInstance() {
        return INSTANCE;
    }

}
