package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.ByteCodeElement;

import java.util.LinkedList;

/**
 */
public class PackageSpecifier extends ByteCodeElement {

    public static final String IDENTIFIER = "PackageSpecifier";

    private final String[] identifiers;

    private PackageSpecifier(final String[] identifiers) {
        this.identifiers = identifiers;
    }

    public static PackageSpecifier parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final LinkedList<String> identifiers = new LinkedList<>();
        QueueString save = string.save();
        while (string.hasNext('/')) {
            final String identifier = string.nextIdentifier();
            if (identifier == null) {
                return null;
            }
            if (string.peek() == '/') {
                string.next();
                identifiers.add(identifier);
                save = string.save();
            } else {
                string.restoreTo(save);
                break;
            }
        }
        return new PackageSpecifier(identifiers.toArray(new String[identifiers.size()]));
    }

    public String[] getIdentifiers() {
        return identifiers;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
