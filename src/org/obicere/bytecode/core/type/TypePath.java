package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.io.BranchSource;
import org.obicere.bytecode.core.io.DirectorySource;
import org.obicere.bytecode.core.io.LeafSource;
import org.obicere.bytecode.core.io.Source;
import org.obicere.bytecode.core.io.ZipArchiveSource;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Obicere
 */
public class TypePath {

    public static void main(final String[] args) {
        final TypePath path = new TypePath();
        final LeafSource source = path.getSource("java/lang/String.class");
        System.out.println(source == null ? "not found" : source.getPath());
    }

    private static final String PROPERTY_CLASSPATH  = "java.class.path";
    private static final String PROPERTY_BOOTPATH   = "sun.boot.class.path";
    private static final String PROPERTY_EXTENSIONS = "java.ext.dirs";

    private final Set<BranchSource> sources = new LinkedHashSet<>();

    public TypePath() {
        this(true);
    }

    public TypePath(final String... sources) {
        this(false, sources);
    }

    public TypePath(final boolean includeSystem, final String... sources) {
        if (includeSystem) {
            addSystemSources();
        }
        addSources(sources);
    }

    public LeafSource getSource(final String path) {
        for (final BranchSource source : sources) {
            final Source child = source.getChild(path);
            if (child.exists()) {
                return (LeafSource) child;
            }
        }
        return null;
    }

    private void addSystemSources() {
        final String classpath = System.getProperty(PROPERTY_CLASSPATH);
        final String bootpath = System.getProperty(PROPERTY_BOOTPATH);
        final String extensions = System.getProperty(PROPERTY_EXTENSIONS);

        addSourcesFromPath(classpath);
        addSourcesFromPath(bootpath);
        addSourcesFromPath(extensions);
    }

    public void addSourcesFromPath(final String path) {
        final String[] split = path.split(File.pathSeparator);
        for (final String entry : split) {
            addSource(entry);
        }
    }

    public void addSource(final String source) {
        if (source == null || source.isEmpty()) {
            return;
        }
        try {
            final File file = new File(source);
            if (!file.exists()) {
                return;
            }
            if (file.isDirectory()) {
                sources.add(new DirectorySource(source));
            } else if (source.endsWith(".zip") || source.endsWith(".jar")) {
                sources.add(new ZipArchiveSource(source));
            }
        } catch (final Throwable e) {
            e.printStackTrace();
        }
    }

    public void addSources(final String... sources) {
        if (sources == null) {
            return;
        }
        for (final String source : sources) {
            addSource(source);
        }
    }

    public void addAll(final Iterable<String> sources) {
        if (sources == null) {
            return;
        }
        final Iterator<String> iterator = sources.iterator();
        if (iterator == null) {
            return;
        }

        while (iterator.hasNext()) {
            addSource(iterator.next());
        }
    }
}
