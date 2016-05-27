package org.obicere.bytecode.core.io;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Obicere
 */
public class DirectorySource implements BranchSource {

    private final String path;

    public DirectorySource(final String path) {
        this.path = path;
    }

    @Override
    public Source[] getChildren(final boolean recursive) {
        final File thisFile = asDirectory();
        final List<Source> sources = new LinkedList<>();
        if (recursive) {
            final Queue<File> stack = new LinkedList<>();
            stack.add(thisFile);
            while (!stack.isEmpty()) {
                final File next = stack.poll();
                final File[] files = next.listFiles();
                if (files == null || files.length == 0) {
                    continue;
                }
                for (final File file : files) {
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            stack.add(file);
                        } else {
                            sources.add(new FileSource(file));
                        }
                    }
                }
            }
        } else {
            final File[] files = thisFile.listFiles();
            if (files == null || files.length == 0) {
                return new Source[0];
            }
            for (final File file : files) {
                if (file.exists() && !file.isDirectory()) {
                    sources.add(new FileSource(file));
                }
            }
        }
        return sources.toArray(new Source[sources.size()]);
    }

    @Override
    public Source getChild(final String name) {
        return new FileSource(asDirectory(), name);
    }

    @Override
    public boolean exists() {
        final File directory = asDirectory();
        return directory.exists() && directory.isDirectory();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return path;
    }

    private File asDirectory() {
        return new File(path);
    }
}
