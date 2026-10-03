# Lab 1 Reflection – Branching Strategy

## Feature-branch vs trunk-based development
The feature-branch workflow isolates in-progress work: each feature lives on its own branch,
is reviewed through a pull request, and only then joins main. Trunk-based development keeps
branches short-lived (hours, not days) and integrates into main at least daily, with feature
flags hiding unfinished work. Trunk-based development minimises painful merges but demands
strong automated tests and team discipline; feature branches are more forgiving for newcomers.

## Choice for a 4-person capstone team
I would choose a **feature-branch workflow with short-lived branches and pull requests**. Four
students with uneven Git experience benefit from PR review as a learning and quality gate, and
the project timeline is short enough that branches rarely live long. I would still merge
small branches frequently to avoid the large merges trunk-based development is designed to prevent.

## What I learned
- A branch is only a pointer; creating one is cheap.
- A three-way merge succeeds when edits touch different hunks (farewell vs Javadoc in this lab).
- Conflicts appear when two branches edit the same lines; resolution means deciding the
  correct combined outcome, not just picking a side.
