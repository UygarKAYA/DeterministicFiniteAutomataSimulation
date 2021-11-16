package Algorithm;

import InputOutput.OutputFile;

import java.util.ArrayList;
import java.util.List;

public class DFAlgorithm {
    public void DFA(ArrayList<String> states, ArrayList<String> goalState, ArrayList<List> transitions, ArrayList<List> dfaString) {

        String currentState = states.get(0);
        String route = "";
        String validation = "";
        String routeValidation = "";

        for (int i=0; i<dfaString.size(); i++) {
            for (int j=0; j<dfaString.get(i).get(0).toString().length(); j++) {
                String chr = dfaString.get(i).get(0).toString().substring(j,j+1);
                for(int t=0; t<transitions.size(); t++) {
                    if(currentState.equals(transitions.get(t).get(0)) && chr.equals(transitions.get(t).get(1))) {
                        currentState = transitions.get(t).get(2).toString();
                        route += currentState + " ";
                        break;
                    }
                }
            }

            for (int s=0; s<goalState.size(); s++) {
                if(goalState.get(s).equals(currentState)) {
                    validation = "Accepted";
                    break;
                }
                else {
                    validation = "Rejected";
                }
            }

            routeValidation += route + "\n" + validation + "\n";
            currentState = states.get(0);
            route = "";
        }

        OutputFile outputFile = new OutputFile();
        outputFile.WriteFile(routeValidation);
    }
}
