package com.zcode.zjw.log.trace.infrastructure.utils;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Print asm code or text.
 * 这里的代码是参考自{@link org.objectweb.asm.util.Printer}的main方法。
 * 推荐使用{@link PrintASMCodeCore}或 {@link PrintASMTextClass}类。
 *
 * @see PrintASMCodeCore
 * @see PrintASMCodeTree
 * @see PrintASMTextClass
 * @see PrintASMTextLambda
 * @see Printer
 */
public class ASMPrint {
    public static void main(String[] args) throws IOException {
        // (1) 设置参数
        String className = "com.zcode.zjw.log.trace.test.TestClass";
        int parsingOptions = ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG;
        boolean asmCode = true;

        // (2) 打印结果
        Printer printer = asmCode ? new ASMifier() : new Textifier();
        PrintWriter printWriter = new PrintWriter(System.out, true);
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(null, printer, printWriter);
        new ClassReader(className).accept(traceClassVisitor, parsingOptions);
    }
}
