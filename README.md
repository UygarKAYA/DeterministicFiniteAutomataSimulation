# _Deterministic Finite Automata Simulation_
***Deterministic Finite Automata (DFA) Simulation***

***DFA Simulation provides information on whether the given string was accepted or rejected and which states it visited. Also, after the program finishes running, it creates an OutputFile***

## _Input File_
***2 (number of states)<br>
2 (number of variables)<br>
1 (number of goal states)<br>
q1 q2 (states)<br>
q2 (goal state(s))<br>
a b (variables)<br>
q1 a q1 (going from state q1 to state q1 with a)<br>
q1 b q2 (going from state q1 to state q2 with b)<br>
q2 a q2 (going from state q2 to state q2 with a)<br>
q2 b q1 (going from state q2 to state q1 with b)<br>
aba (string to be detected)<br>
ababababa (string to be detected)***

## _Output File_
***q1 q2 q2 (route taken)<br>
Accepted<br>
q1 q2 q2 q1 q1 q2 q2 q1 q1 (route taken)<br>
Rejected***

