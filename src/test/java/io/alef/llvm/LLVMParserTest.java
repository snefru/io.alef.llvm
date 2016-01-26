package io.alef.llvm;

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
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LLVMParserTest {

    private final File file;

    public LLVMParserTest(final File file) {
        this.file = file;
    }

    @Parameters
    public static Collection<File> data() {
        return Arrays.asList(new File(LLVMParserTest.class.getResource("/examples").getFile()).listFiles());
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
