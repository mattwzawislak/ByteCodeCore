package org.obicere.bytecode.core.reader;

import org.javacore.Identifier;
import org.obicere.bytecode.core.reader.annotation.AnnotationReader;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;
import org.obicere.bytecode.core.reader.annotation.TypeAnnotationReader;
import org.obicere.bytecode.core.reader.attribute.AttributeReader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

import java.util.Map;

/**
 */
public class DefaultReaders extends AbstractReaders {

    public DefaultReaders() {
        provideDefaults();
    }

    public DefaultReaders(final Map<Identifier, Reader<?>> readers) {
        super(readers);
        provideDefaults();
    }

    public DefaultReaders(final Readers readers) {
        super(readers);
        provideDefaults();
    }

    protected void provideDefaults() {
        setReader(Identifier.CLASS, new ClassReader());
        setReader(Identifier.FIELD, new FieldReader());
        setReader(Identifier.METHOD, new MethodReader());

        // multi readers delegate to the individual readers.
        // should I bother adding those individual readers in? Maybe

        // update on 2017-03-34: yes you should add the individual ones in
        // TODO be smart

        setReader(Identifier.ATTRIBUTE, new AttributeReader());
        setReader(Identifier.ELEMENT_VALUE, new ElementValueReader());
        setReader(Identifier.INSTRUCTION, new InstructionReader());
        setReader(Identifier.VERIFICATION_TYPE_INFO, new VerificationTypeInfoReader());

        setReader(Identifier.ANNOTATION, new AnnotationReader());
        setReader(Identifier.TYPE_ANNOTATION, new TypeAnnotationReader());

        // TODO FIX THIS SHIT YOU SACK OF SHIT
    }
}
