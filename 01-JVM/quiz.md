# JVM Quiz

## Short Answers

1. What does the JVM execute directly: Java source code or bytecode?
2. What tool compiles `.java` files into `.class` files?
3. Where are Java objects stored?
4. Where are local variables stored?
5. Where is class metadata stored?
6. Is `count++` atomic?
7. Does `volatile` make compound operations atomic?
8. Does `synchronized` lock the reference variable?
9. What makes an object eligible for garbage collection?
10. What does the JIT compiler produce?
11. What JVM memory area replaced PermGen in Java 8?
12. Why can a Java service be slower immediately after restart?
13. If two references point to the same object, how many object monitors are relevant for that object?

## Answers

1. Bytecode.
2. `javac`.
3. Heap.
4. Stack frames.
5. Metaspace, conceptually JVM-managed class metadata memory.
6. No.
7. No.
8. No. It locks the object referred to by the expression.
9. The object is no longer reachable from any live root.
10. Optimized native machine code.
11. Metaspace.
12. The JVM may still be warming up through interpretation, profiling, and JIT compilation.
13. One.
