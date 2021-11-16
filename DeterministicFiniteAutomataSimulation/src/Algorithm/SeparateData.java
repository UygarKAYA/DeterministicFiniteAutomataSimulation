package Algorithm;

import java.util.*;

public class SeparateData {

    private int numStates;
    private int numVariables;
    private int numGoalState;
    private ArrayList<String> states;
    private ArrayList<String> goalState;
    private ArrayList<String> variables;
    private ArrayList<String> temp;
    private ArrayList<List> transitions;
    private ArrayList<List> dfaString;

    public void SplitData(ArrayList<String> arrayList) {
        numStates = Integer.parseInt(arrayList.get(0));
        numVariables = Integer.parseInt(arrayList.get(1));
        numGoalState = Integer.parseInt(arrayList.get(2));
        states = new ArrayList<String>(Arrays.asList(arrayList.get(3).split(" ")));
        goalState = new ArrayList<String>(Arrays.asList(arrayList.get(4).split(" ")));
        variables = new ArrayList<String>(Arrays.asList(arrayList.get(5).split(" ")));
        transitions = new ArrayList<List>();
        dfaString = new ArrayList<List>();

        for (int i=6; i<(numStates*numVariables)+6; i++) {
            temp = new ArrayList<String>(Arrays.asList(arrayList.get(i).split(" ")));
            transitions.add(temp);
        }
        for (int i=(numStates*numVariables)+6; i<arrayList.size(); i++) {
            temp = new ArrayList<String>(Arrays.asList(arrayList.get(i)));
            dfaString.add(temp);
        }

        DFAlgorithm dfAlgorithm = new DFAlgorithm();
        dfAlgorithm.DFA(states, goalState, transitions, dfaString);
    }
}
