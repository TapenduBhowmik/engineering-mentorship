# Mentor Instructions

Read this file before making any changes to this repository. Follow its writing style, chapter template, and engineering standards for all future work.

## Repository Principle

Nothing gets committed without understanding it.

This handbook must grow through a deliberate loop:

1. Learn one topic.
2. Discuss it deeply.
3. Build the chapter or artifact.
4. Review it for correctness and engineering depth.
5. Commit it.
6. Move to the next topic.

Do not generate large batches of chapters without the user first learning and discussing the material. The repository should reflect the user's actual growth as an engineer.

## Role of Codex

Codex is responsible for implementation work inside the repository:

- Create and update Markdown chapters.
- Add runnable code examples.
- Add Mermaid diagrams.
- Keep files organized and consistent.
- Review diffs before committing.
- Avoid committing changes that are not understood or requested.

When creating learning content, Codex should act like a careful engineering editor, not a content factory.

## Role of the Mentor

The technical mentor provides:

- Deep explanations.
- Architecture discussion.
- Review and critique.
- Staff-level framing.
- Interview preparation.
- Guidance on what to build next.

Codex should preserve that mentor-led workflow by producing focused artifacts after the topic has been discussed.

## Writing Style

Use a professional, clear, engineering-focused voice.

Prefer:

- Precise explanations over vague motivation.
- Practical examples over abstract definitions alone.
- Tradeoffs and failure modes over happy-path descriptions.
- Clear diagrams where they reduce cognitive load.
- Interview-quality language without sounding like a memorized answer.

Avoid:

- Fluff.
- Overclaiming.
- Unreviewed mass generation.
- Shallow bullet lists with no reasoning.
- Marketing language.

## Chapter Standards

Every chapter should follow [CHAPTER_TEMPLATE.md](CHAPTER_TEMPLATE.md) unless there is a strong reason to deviate.

A strong chapter should usually include:

- A clear learning objective.
- Why the topic matters in real systems.
- Mental models.
- Step-by-step explanations.
- Mermaid diagrams.
- Runnable examples where relevant.
- Common misconceptions.
- Production implications.
- Interview questions.
- Exercises.
- A concise summary.

## Engineering Standards

For code examples:

- Keep examples runnable and minimal.
- Include commands when useful.
- Prefer correctness and clarity over cleverness.
- Name files, classes, methods, and variables clearly.
- Explain behavior that may surprise readers.

For diagrams:

- Use Mermaid when text-based diagrams are enough.
- Keep diagrams small enough to understand.
- Use labels that teach the concept, not just decorate the page.

For commits:

- Review `git diff` before committing.
- Commit only related changes.
- Use clear commit messages.
- Do not mix unrelated refactors or formatting churn into content commits.

## Future Work Instruction

Before editing this repository in future sessions, Codex should read this file and align its changes with:

- The repository principle.
- The chapter template.
- The style guide.
- The current roadmap and summary.
