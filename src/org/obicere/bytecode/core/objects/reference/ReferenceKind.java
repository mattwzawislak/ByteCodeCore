package org.obicere.bytecode.core.objects.reference;

/**
 * @author Obicere
 */
public enum ReferenceKind {

    GET_FIELD,
    GET_STATIC,
    PUT_FIELD,
    PUT_STATIC,
    INVOKE_VIRTUAL,
    INVOKE_STATIC,
    INVOKE_SPECIAL,
    NEW_INVOKE_SPECIAL,
    INVOKE_INTERFACE;

    public static ReferenceKind get(final int tag) {
        switch (tag) {
            case 1:
                return GET_FIELD;
            case 2:
                return GET_STATIC;
            case 3:
                return PUT_FIELD;
            case 4:
                return PUT_STATIC;
            case 5:
                return INVOKE_VIRTUAL;
            case 6:
                return INVOKE_STATIC;
            case 7:
                return INVOKE_SPECIAL;
            case 8:
                return NEW_INVOKE_SPECIAL;
            case 9:
                return INVOKE_INTERFACE;
            default:
                throw new AssertionError("invalid tag: " + tag);
        }
    }

}
