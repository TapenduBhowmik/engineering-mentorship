# JVM Common Mistakes

## Mistake: Heap Stores Variables

Incorrect:

```text
The heap stores all variables.
```

Correct:

```text
The heap stores objects and arrays. Local variables live in stack frames. A local variable can hold a reference to a heap object.
```

## Mistake: Reference and Object Are the Same Thing

Incorrect:

```text
TelemetryGateway gateway is the object.
```

Correct:

```text
gateway is a reference variable. The object is created by new TelemetryGateway() and lives on the heap.
```

## Mistake: Null Deletes the Object

Incorrect:

```text
e = null deletes the object.
```

Correct:

```text
e = null removes one reference. The object is eligible for garbage collection only if no live root can reach it.
```

## Mistake: Volatile Makes Code Thread-Safe

Incorrect:

```text
volatile int count; count++ is thread-safe.
```

Correct:

```text
volatile gives visibility and ordering guarantees for reads and writes of that variable. It does not make read-modify-write operations atomic.
```

## Mistake: Synchronized Locks the Reference

Incorrect:

```text
synchronized locks the variable e.
```

Correct:

```text
synchronized locks the object referred to by e.
```

## Mistake: Every Class Loads at Startup

Incorrect:

```text
The JVM loads all application classes immediately.
```

Correct:

```text
Classes are commonly loaded lazily when first needed.
```

## Mistake: JIT Means Java Is Always Compiled Before Running

Incorrect:

```text
The JVM compiles the whole application before execution.
```

Correct:

```text
The JVM can interpret bytecode first and compile hot paths after observing runtime behavior.
```

## Mistake: JVM Warmup Is Only a Benchmark Issue

Incorrect:

```text
Warmup matters only in microbenchmarks.
```

Correct:

```text
Warmup can affect real services after restart, autoscaling, failover, and rolling deployments.
```

## Mistake: Memory Problem Means Heap Problem

Incorrect:

```text
All JVM memory problems are heap problems.
```

Correct:

```text
Heap is critical, but JVM memory also includes stacks, Metaspace, native memory, direct buffers, code cache, and other runtime areas depending on the application.
```

## Mistake: One Line of Java Means One Runtime Operation

Incorrect:

```text
count++ is one operation because it is one line.
```

Correct:

```text
Source-code appearance is not the same as runtime behavior. count++ involves read, modify, and write.
```
