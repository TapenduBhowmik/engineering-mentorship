# JVM Glossary

## Application Class Loader

The class loader that loads application classes from the classpath or module path.

## Bytecode

The portable instruction format stored in `.class` files and executed by the JVM.

## Class Loading

The process of finding class bytecode and creating the JVM's internal representation of that class.

## Garbage Collection

The JVM process of reclaiming memory used by objects that are no longer reachable.

## GC Root

A starting point used by the garbage collector to determine reachability, such as active stack references, static fields, active threads, and JNI references.

## Heap

The shared runtime memory area where Java objects and arrays are stored.

## Hot Method

A method or loop executed frequently enough that the JVM may compile it into optimized native machine code.

## JDK

Java Development Kit. Includes tools such as `javac` plus the runtime needed to build and run Java programs.

## JIT Compiler

Just-In-Time compiler. Converts hot bytecode into optimized native machine code while the program runs.

## Mark Word

Part of the object header in HotSpot discussions. It stores runtime metadata used for concerns such as locking, identity hash code, and garbage collection state. This chapter introduces the term only as a preview.

## JVM

Java Virtual Machine. The managed runtime that loads classes, executes bytecode, manages memory, coordinates threads, and provides runtime services.

## Metaspace

JVM-managed native memory used for class metadata in HotSpot-based JVMs.

## PermGen

Permanent Generation. A pre-Java 8 HotSpot memory area used for class metadata. It was replaced by Metaspace in Java 8.

## Monitor

The synchronization mechanism associated with a Java object and used by `synchronized`.

## Object Header

Runtime metadata stored with an object, including information used by the JVM for identity, locking, and garbage collection.

## PC Register

Per-thread program counter that tracks the current execution position.

## Stack Frame

A per-method-call structure on a thread's Java stack. It stores local variables, operand stack data, and method execution state.

## Volatile

A Java keyword that provides visibility and ordering guarantees for reads and writes of a variable. It does not make compound operations atomic.

## Warmup

The period after JVM startup when code may still be interpreted, profiled, and compiled. Warmup can affect latency and throughput.
