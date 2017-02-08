package org.obicere.bytecode.core.objects.common;

/**
 */
public enum Version {

    JAVA_1_2(46, 0),
    JAVA_1_3(47, 0),
    JAVA_1_4(48, 0),
    JAVA_5(49, 0),
    JAVA_6(50, 0),
    JAVA_7(51, 0),
    JAVA_8(52, 0),
    JAVA_9(53, 0);

    private final int major;

    private final int minor;

    private Version(final int major, final int minor) {
        this.major = major;
        this.minor = minor;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public static Version getDefault() {
        // java 8 build, be sure to update when Java 9 is common build
        return JAVA_8;
    }
}
