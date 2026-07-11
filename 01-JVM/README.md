# 01-JVM

This track builds JVM understanding from first principles.

The goal is not to memorize JVM terms. The goal is to learn to reason like the runtime:

- What starts when `java` runs?
- Where does code live?
- Where do objects live?
- What is private to a thread?
- What is shared across threads?
- Why does visibility fail?
- What does synchronization really lock?
- How do these details show up in production systems?

## Handbook Direction

Working series title:

**Engineering from First Principles**

Volume 1:

**Thinking Like the JVM**

Future volumes may grow from the same style:

- Thinking Like the Operating System.
- Thinking Like the Network.
- Thinking Like Distributed Systems.
- Thinking Like Cloud.
- Thinking Like an AI Engineer.
- Thinking Like a Principal Engineer.

## Working Chapter Title

**Chapter 1 - Thinking Like the JVM**

Subtitle: **Understanding Java Execution from Source Code to CPU**

## Track Structure

- [chapter1.md](chapter1.md): Main chapter narrative.
- [interview.md](interview.md): Interview questions and reasoning prompts.
- [exercises.md](exercises.md): Hands-on practice.
- [quiz.md](quiz.md): Short checks for recall and reasoning.
- [common-mistakes.md](common-mistakes.md): Misconceptions corrected.
- [principal-notes.md](principal-notes.md): Production and principal engineer perspective.
- [glossary.md](glossary.md): JVM terms introduced in this chapter.
- [diagrams/README.md](diagrams/README.md): Mermaid diagrams used by this chapter.

## Chapter Plan

Chapter 1 is intentionally broad. It creates the mental model for the JVM before future chapters go deeper into class loading, memory, garbage collection, JIT compilation, the Java Memory Model, and synchronization.

The chapter should be reviewed and improved through mentorship before it is considered complete.

## Chapter Identity

Every major topic should follow this learning pattern:

1. Start with a problem.
2. Ask what the JVM must do.
3. Explain the JVM's solution.
4. Draw the memory or execution model.
5. Test the idea with an interview question.
6. Connect it to production engineering.
