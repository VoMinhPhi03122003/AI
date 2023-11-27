package Lab8;

import java.awt.Desktop.Action;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MiniMaxSearchAlgo implements ISearchAlgo {

	// function MINIMAX-DECISION(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state)
	// return the action in SUCCESSORS(state) with value v
	@Override
	public void execute(Node node) {
		int v = maxValue(node , Integer.MAX_VALUE);
		System.out.println(v);

	}

	// function MAX-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MIN_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s))
	// return v
	public int maxValue(Node node) {
		if (node.isTerminal()) {
			return node.getValue();
		}
		int max = node.getValue();
		for (Node sub : node.getChildren()) {
			if (sub.getValue() > max) {
				
			}
			return max;

		}

		return Integer.MIN_VALUE;
	}
	// function MIN-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s))
	// return v

	public int minValue(Node node) {
		if(node.isTerminal()) {
			return node.getValue();
			
		}
		int min = node.getValue();
		for (Node sub : node.getChildren()) {
			if (sub.getValue() > min) {
				
			}
			return min;
		
		return Integer.MAX_VALUE;
	}
}
