# JVM Diagrams

These Mermaid diagrams support Chapter 1.

## TelemetryGateway Architecture

```mermaid
flowchart LR
    OpcUa[OPC UA devices] --> Gateway[TelemetryGateway JVM process]
    Mqtt[MQTT devices] --> Gateway
    Gateway --> Kafka[Kafka]
    Gateway --> Timescale[TimescaleDB]
    Gateway --> IoT[Azure IoT]
```

## TelemetryGateway JVM Internals

```mermaid
flowchart TB
    subgraph JVM["TelemetryGateway JVM"]
        GatewayObj[TelemetryGateway object]
        Worker1[TelemetryWorker thread]
        Worker2[TelemetryWorker thread]
        Queue[Shared telemetry queue]
        Flag[volatile running flag]
        Method[processTelemetry method]
    end

    Worker1 --> Queue
    Worker2 --> Queue
    Worker1 --> Flag
    Worker2 --> Flag
    Worker1 --> Method
    Worker2 --> Method
    GatewayObj --> Queue
```

## Java Execution

```mermaid
flowchart LR
    Source[Java source code] --> Compiler[javac compiler]
    Compiler --> Bytecode[.class bytecode]
    Bytecode --> JVM[JVM process]
    JVM --> OS[Operating system]
    OS --> CPU[CPU and memory]
```

## JVM Startup

```mermaid
flowchart TD
    JavaExe[java command] --> Process[Native OS process starts]
    Process --> JVMStartup[JVM initializes]
    JVMStartup --> MainThread[Main thread created]
    MainThread --> ClassLoader[Load main class]
    ClassLoader --> MainMethod[Invoke public static void main]
    MainMethod --> Execution[Execute bytecode]
```

## Runtime Memory

```mermaid
flowchart TB
    subgraph Shared["Shared by threads"]
        Heap[Heap: objects and arrays]
        Meta[Metaspace: class metadata]
    end

    subgraph ThreadA["Thread A private"]
        StackA[Java stack]
        PcA[PC register]
        NativeA[Native method stack]
    end

    subgraph ThreadB["Thread B private"]
        StackB[Java stack]
        PcB[PC register]
        NativeB[Native method stack]
    end
```

## Heap Object

```mermaid
flowchart LR
    subgraph Stack["Stack frame"]
        Ref[gateway reference]
    end

    subgraph Heap["Shared heap"]
        Obj[TelemetryGateway object]
    end

    Ref --> Obj
```

## Stack Frames

```mermaid
flowchart TB
    subgraph Thread["Thread"]
        Frame3[methodC stack frame]
        Frame2[methodB stack frame]
        Frame1[main stack frame]
    end

    Frame3 --> Frame2
    Frame2 --> Frame1
```

## Object References

```mermaid
flowchart LR
    subgraph Stack["Stack frame"]
        e1[gateway1 reference]
        e2[gateway2 reference]
    end

    subgraph Heap["Heap"]
        Obj[TelemetryGateway object]
    end

    e1 --> Obj
    e2 --> Obj
```

## Garbage Collection Reachability

```mermaid
flowchart TD
    Roots[GC roots] --> e2[gateway2 local reference]
    e2 --> Obj[TelemetryGateway object]
    e1[gateway1 = null] -. no edge .-> Obj
```

## Monitor Ownership

```mermaid
flowchart LR
    e1[gateway1] --> Obj[TelemetryGateway object: header + fields]
    e2[gateway2] --> Obj
    Obj --> Monitor[Monitor associated with object]
```

## JIT Execution

```mermaid
flowchart LR
    Bytecode[Bytecode] --> Interpreter[Interpreter]
    Bytecode --> Profiler[Runtime profiling]
    Profiler --> Hot[Hot methods detected]
    Hot --> JIT[JIT compiler]
    JIT --> Native[Optimized native machine code]
```

## CPU Cache Visibility

```mermaid
flowchart LR
    Core1[CPU Core 1] --> Cache1[Cache]
    Cache1 --> Heap[Main memory / heap]
    Heap --> Cache2[Cache]
    Cache2 --> Core2[CPU Core 2]
```
