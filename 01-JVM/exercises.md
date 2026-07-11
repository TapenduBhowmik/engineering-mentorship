# JVM Exercises

## Beginner Exercises

## Exercise 1: Draw the Object

Draw the memory layout for:

```java
TelemetryGateway gateway = new TelemetryGateway();
```

Your drawing must show:

- Stack frame.
- Local reference variable.
- Heap object.
- Class metadata.

## Exercise 2: Aliasing

Draw the memory layout for:

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = gateway1;
```

Then answer:

- How many objects exist?
- How many reference variables exist?
- What happens if `gateway1 = null`?

## Exercise 3: Reachability

Predict which objects are eligible for garbage collection:

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = new TelemetryGateway();
TelemetryGateway gateway3 = gateway1;

gateway1 = null;
gateway2 = null;
```

Explain your answer using reachability.

## Intermediate Exercises

## Exercise 4: Shutdown Flag

Write a class with:

- A worker loop.
- A `volatile boolean running` field.
- A `stop()` method.

Explain why `volatile` is appropriate for this case.

## Exercise 5: Unsafe Counter

Write a small program where two threads increment a shared `int` many times.

First use:

```java
count++;
```

Then replace it with `AtomicInteger`.

Explain the difference between visibility and atomicity.

## Exercise 6: Object Monitor

Create two references to the same object:

```java
Object lock1 = new Object();
Object lock2 = lock1;
```

Synchronize on both references and explain why they refer to the same monitor.

## Advanced Exercises

## Exercise 7: 1000 MQTT Devices

Design a Java edge gateway process that receives telemetry from 1000 MQTT devices.

Answer:

- How many threads would you start?
- Which data structures are shared?
- Which data structures are thread-confined?
- What must be volatile, atomic, synchronized, or protected by a higher-level concurrency utility?
- How would the service shut down safely?

## Exercise 8: Kafka Consumer Restart

A Kafka consumer becomes slower immediately after restart and recovers after several minutes.

Explain:

- How JIT warmup may contribute.
- How you would prove or disprove that hypothesis.
- What metrics you would inspect.
- How you would design a fair performance test.

## Exercise 9: Telemetry Allocation Review

Review a telemetry transformation pipeline.

Identify:

- Which objects are long-lived.
- Which objects are short-lived.
- Where allocation rate could become a bottleneck.
- What evidence would show GC pressure.

## Exercise 10: Teach It

Teach a junior engineer why this code has one object and two references:

```java
TelemetryGateway gateway1 = new TelemetryGateway();
TelemetryGateway gateway2 = gateway1;
```

Your explanation must include:

- Stack.
- Heap.
- Object identity.
- Monitor ownership.
- GC reachability.

## Exercise 11: Explain It Back

Explain the following in your own words:

- Heap.
- Stack.
- Metaspace.
- PC register.
- Native method stack.
- Bytecode.
- JIT.
- Monitor.
- Happens-before.
