package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphaBetaSearchAlgo implements ISearchAlgo {

	// function ALPHA-BETA-SEARCH(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state, Integer.MIN_VALUE , Integer.MAX_VALUE)
	// return the action in SUCCESSORS(state) with value v

	// int v = maxValue(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

	@Override
	public void execute(Node node) {
		int v = maxValue(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(v);
	}

	// function MAX-VALUE(state, alpha, beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- MIN_VALUE;
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s, alpha, beta))
	// if v >= beta then return v
	// alpha <- MAX(alpha, v)
	// return v

	public int maxValue(Node node, int alpha, int beta) {
		int v = Integer.MAX_VALUE;
		List<Node> children = node.getChildren();
		for (Node child : children) {
			v = Math.max(v, minValue(node, alpha, beta));
			if (v >= beta) {
				return v;
			}
			alpha = Math.max(alpha, v);

		}
		return Integer.MIN_VALUE;
	}
	// function MIN-VALUE(state, alpha , beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s, alpha , beta))
	// if v <= alpha then return v
	// beta <- MIN(beta ,v)
	// return v

	public int minValue(Node node, int alpha, int beta) {
		int v = Integer.MAX_VALUE;
		List<Node> children = node.getChildren();
		for (Node child : children) {
			v = Math.max(v, minValue(node, alpha, beta));
			if (v <= beta) {
				return v;
			}
			alpha = Math.max(alpha, v);

		}
		return Integer.MAX_VALUE;
	}
}
