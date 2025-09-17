This is a basic implemenation of a prisoner's dilemma tournament

## Running Instructions
- Compile all files locally
   - cd into the folder with the files
   - javac Runner.java
   - java Runner.java

## What does this project do
This runs a prisoners dilemma

The table looks like this:

```
                         Player 1 betrays       Player 1 cooperates
Player 2 betrays    |         1, 1       |           5, 0            |
Player 2 cooperates |         3, 3       |           0, 5            |
```

A tournament will be run from all selected bots, which will either choose to betray or cooperate each round.
At the end the bot with the highest score will win.  The number of rounds will be known beforehand.
