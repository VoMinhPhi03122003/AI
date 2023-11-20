package Lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// github copilot

import org.w3c.dom.Node;

public class BreadthFirstSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node currnet = frontier.poll();
			if (currnet.getLabel().equals(goal)) {
				return currnet;

			}else {
				frontier.remove();
				for (int i = 0; i < currnet	.getChildNodes().size(); i++) {
					frontier.add(currnet.getChildNodes().get(i));
					
					
				}
			}

		}

		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {

		return null;
	}

}
