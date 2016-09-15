package org.obicere.bytecode.core.objects.constant;

/**
 * TODO: in the event the constant pool gets overflowed, do this:
 *
 if (index >= CONSTANT_POOL_MAX_INDEX) {
 throw new InternalError("WHAT THE FUCK ARE YOU DOING?! Like seriously, this file is way too big. You managed to allocate 65,535 unique entries into the constant pool and you still want more? Believe it or not you can use multiple classes in Java, you fucking dipshit. You don't need to write your entire fucking framework in one class. Like how big is this shit anyway? Are you trying to get a rocket to the fucking Andromeda galaxy? You can fuck right off, Elon Musk. I don't give a shit if you want this all in one class, you can't have it. Boo-fucking-hoo. Go back to python you degenerate piece of shit.");
 }
 *
 * @author Obicere
 */
public class ConstantPool {

    public static final String NULL_ENTRY = "<null entry>";

    private Constant[] constants;

    public ConstantPool(){
    }

    public ConstantPool(final Constant[] constants) {
        this.constants = constants;
    }

    public Constant[] getConstants() {
        return constants;
    }

    public void setConstants(final Constant[] constants) {
        this.constants = constants;
    }

    @SuppressWarnings("unchecked")
    public <C extends Constant> C get(final int index) {
        if (index >= constants.length) {
            return null;
        }
        return (C) constants[index];
    }

    public String getAsString(final int index) {
        final Constant constant = get(index);
        if (constant == null) {
            return NULL_ENTRY;
        }
        return constant.toString();
    }
}
