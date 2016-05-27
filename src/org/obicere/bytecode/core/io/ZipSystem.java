package org.obicere.bytecode.core.io;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Obicere
 */
public class ZipSystem {

    private final Map<String, ZipArchiveSource> files = new ConcurrentHashMap<>();

    private static final ZipSystem SYSTEM_ZIP_SYSTEM = new ZipSystem();

    public static ZipSystem getSystemZipSystem() {
        return SYSTEM_ZIP_SYSTEM;
    }

    public ZipArchiveSource getZipFile(final String name) throws IOException {
        final ZipArchiveSource file = files.get(name);
        if (file != null && !file.isClosed()) {
            return file;
        }

        final ZipArchiveSource newFile = new ZipArchiveSource(name);
        if (!newFile.exists()) {
            throw new IOException("zip file does not exist.");
        }
        files.put(name, newFile);

        return newFile;
    }

    public Set<String> clean() {
        final Set<String> removed = new HashSet<>();
        for (final Map.Entry<String, ZipArchiveSource> entry : files.entrySet()) {
            final ZipArchiveSource file = entry.getValue();
            if (file == null || file.isClosed() || file.isComplete()) {
                final String key = entry.getKey();
                files.remove(key);
                removed.add(key);
                break;
            }
        }
        return removed;
    }
}
