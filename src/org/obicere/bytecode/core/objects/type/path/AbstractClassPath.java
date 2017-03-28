package org.obicere.bytecode.core.objects.type.path;

import org.obicere.bytecode.core.io.BranchSource;
import org.obicere.bytecode.core.io.DirectorySource;
import org.obicere.bytecode.core.io.LeafSource;
import org.obicere.bytecode.core.io.Source;
import org.obicere.bytecode.core.io.ZipArchiveSource;
import org.obicere.bytecode.core.reader.JCClassReader;
import org.javacore.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;
import org.obicere.bytecode.core.util.factory.ByteCodeReaderFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Obicere
 */
public abstract class AbstractClassPath implements ClassPath {

    private final Set<BranchSource> packages = new HashSet<>();

    public void addPackage(final String path) {
        if (path == null || path.isEmpty()) {
            return;
        }

        final File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                packages.add(new DirectorySource(path));
            } else if (path.endsWith(".zip") || path.endsWith(".jar")) {
                packages.add(new ZipArchiveSource(path));
            }
        }
    }

    public void addExtensions(final String path) {
        if (path == null || path.isEmpty()) {
            return;
        }
        final StringTokenizer tokenizer = new StringTokenizer(path, File.pathSeparator);
        while (tokenizer.hasMoreTokens()) {

            final String next = tokenizer.nextToken();
            if (next.isEmpty()) {
                continue;
            }

            final File file = new File(next);
            final File[] files = file.listFiles();

            if (files == null) {
                continue;
            }

            for (final File extension : files) {
                if (extension.exists()) {

                    final String name = extension.getName();
                    if (name.endsWith(".zip") || name.endsWith(".jar")) {
                        packages.add(new ZipArchiveSource(extension.getAbsolutePath()));
                    }
                }
            }
        }
    }

    public void addPackages(final String path) {
        if (path == null || path.isEmpty()) {
            return;
        }
        final StringTokenizer tokenizer = new StringTokenizer(path, File.pathSeparator);

        while (tokenizer.hasMoreTokens()) {

            final String next = tokenizer.nextToken();
            addPackage(next);
        }
    }

    @Override
    public Type find(final String name) {
        return searchPackagesForType(name);
    }

    private Type searchPackagesForType(final String name) {
        final String fileName = name.replace('.', '/') + ".class";
        if (packages.size() == 0) {
            throw new RuntimeException("no packages installed");
        }
        for (final BranchSource source : packages) {
            final Source child = source.getChild(fileName);
            if (child != null && child.exists()) {
                if (child instanceof LeafSource) {
                    final LeafSource file = (LeafSource) child;

                    return readClass(file);
                }
            }
        }
        throw new RuntimeException("could not find file: " + fileName);
    }

    private Type readClass(final LeafSource source) {
        try {
            final InputStream stream = source.getInputStream();
            final ByteCodeReader input = ByteCodeReaderFactory.createReader(stream);

            final JCClassReader reader = new JCClassReader();

            final Type cls = reader.read(input);

            input.close();

            return cls;
        } catch (final IOException e) {
            e.printStackTrace();

            // fuck it
            throw new RuntimeException("cannot load class", e);
        }
    }

}
