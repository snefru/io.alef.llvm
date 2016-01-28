package io.alef.llvm;

import com.google.common.base.Predicate;
import com.google.common.io.Files;
import io.alef.llvm.LLVMParser.ModuleContext;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.Trees;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LLVMParserTest {

    public static final Predicate<File> FILE = new Predicate<File>() {
        public boolean apply(final File file) {
            return file.isFile() && file.getName().endsWith(".ll");
        }
    };
    private final File file;

    public LLVMParserTest(final File file) {
        this.file = file;
    }

    @Parameters
    public static Collection<File> data() {
        return Files.fileTreeTraverser().preOrderTraversal(new File(LLVMParserTest.class.getResource("/examples").getFile())).filter(FILE).toList();
    }

    @Test
    public void parse() throws IOException {
        System.out.println(file.getName() + "-------------------------------");
        final LLVMLexer lexer = new LLVMLexer(new ANTLRFileStream(file.getAbsolutePath()));
        final CommonTokenStream stream = new CommonTokenStream(lexer);
        final LLVMParser parser = new LLVMParser(stream);
        parser.setErrorHandler(new BailErrorStrategy());
        final ModuleContext module = parser.module();
        System.out.println(Trees.toStringTree(module));
    }
}
