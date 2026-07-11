# JVM Interview Questions

This file collects questions from Chapter 1. The goal is to test reasoning, not memorization.

## Objects and References

1. In `TelemetryGateway gateway = new TelemetryGateway();`, where is the object stored?
2. Where is the local variable `gateway` stored?
3. Where is the `TelemetryGateway` class metadata stored?
4. In the following code, how many objects exist?

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = gateway1;
```

Answer: one object, two reference variables.

5. After this code, is the object eligible for garbage collection?

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = gateway1;
gateway1 = null;
```

Answer: no, because `gateway2` still reaches the object.

## Monitors and Synchronization

1. Does `synchronized` lock a reference or an object?
2. In the following code, how many monitors are involved?

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = gateway1;

synchronized (gateway1) {
    synchronized (gateway2) {
        System.out.println("same object");
    }
}
```

Answer: one object monitor is involved because both references point to the same object.

3. If `e1` is later assigned to a new object, does the original object's monitor move?

Answer: no. The monitor is associated with the object, not the variable.

## Runtime Memory

1. Which JVM memory areas are shared between threads?
2. Which JVM memory areas are private to each thread?
3. Why does each thread need its own stack?
4. Why does each thread need its own PC register?
5. Can two threads point to the same heap object?

## Execution Engine

1. What is bytecode?
2. Why does the JVM use an interpreter?
3. What is a hot method?
4. What does the JIT compiler do?
5. Why can JVM warmup affect performance measurements?

## Java Memory Model

1. Why is `count++` not atomic?
2. What are the read, modify, and write steps?
3. What is visibility?
4. What does `volatile` provide?
5. Why does `volatile` not make `count++` safe?
6. What is instruction reordering?
7. What is a happens-before relationship?

## How Interviewers Think

### Volatile

Basic answer:

```text
volatile provides visibility.
```

Better answer:

```text
volatile provides visibility and ordering guarantees for reads and writes of that variable. It works well for a simple shutdown flag, but it does not make compound operations like count++ atomic.
```

Principal-level answer:

```text
I would first ask what problem we are solving. If it is a one-way lifecycle signal, volatile may be enough. If multiple threads update shared state, I need atomicity or mutual exclusion. I would also look for a clear happens-before relationship so the behavior is reliable under the Java Memory Model.
```

### Object Monitor

Basic answer:

```text
synchronized locks the object.
```

Better answer:

```text
The reference expression evaluates to an object, and the monitor associated with that object is used. Multiple references to the same object use the same monitor.
```

Principal-level answer:

```text
I care about which object is being used as the lock, whether that object is shared intentionally, whether it can escape unexpectedly, and whether the lock protects all access to the shared invariant.
```

### JVM Warmup

Basic answer:

```text
The JVM gets faster after startup.
```

Better answer:

```text
The JVM may interpret first, collect profiling data, identify hot methods, and JIT compile optimized native code.
```

Principal-level answer:

```text
I would avoid measuring only cold-start behavior unless cold start is the requirement. For Kafka consumers, autoscaling, and rolling deployments, warmup can affect lag, latency, and capacity planning.
```

## Principal-Level Prompts

1. How could a visibility bug affect an edge gateway shutdown?
2. How could JVM warmup affect a Kafka consumer benchmark?
3. Why does object allocation matter in a high-throughput telemetry pipeline?
4. What JVM diagnostics would you request if a Java service had rising memory usage?
5. How would you explain JVM memory areas to a junior engineer in five minutes?
6. How would you design a Java service that handles telemetry from 1000 MQTT devices?
7. What shared state exists in your design, and how is it protected?
8. What changes if the service must shut down safely during an active telemetry burst?
