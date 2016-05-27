package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public enum PrimitiveType implements Type {

    BOOLEAN("boolean", 'Z'),
    BYTE("byte", 'B'),
    SHORT("short", 'S'),
    CHAR("char", 'C'),
    INT("int", 'I'),
    FLOAT("float", 'F'),
    LONG("long", 'J'),
    DOUBLE("double", 'D');

    private final String name;

    private final char character;

    private PrimitiveType(final String name, final char character) {
        this.name = name;
        this.character = character;
    }

    @Override
    public String getDescriptor() {
        return String.valueOf(character);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSimpleName() {
        return name;
    }

    @Override
    public String getCanonicalName() {
        return name;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public boolean isGeneric() {
        return false;
    }

    @Override
    public boolean isArray() {
        return false;
    }
}
