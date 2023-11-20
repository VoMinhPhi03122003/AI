package Lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute1(Node root, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		Node n = null;
		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node currnet = frontier.poll();
			if (currnet.getLabel().equals(goal)) {
				return currnet;

			} else {
				explored.add(currnet);

				List<Node> children = currnet.getChildrenNodes();

				for (Node child : children) {
					if (frontier.contains(child) && explored.contains(child)) {
						frontier.add(child);
						child.setParent(currnet);

					}

				}
			}

		}

		return n;
	}

//	@Override
//	public Node execute(Node root, String start, String goal) {
//		Queue<Node> frontier = new LinkedList<Node>();
//		frontier.add(root);
//		List<Node> explored = new ArrayList<Node>();
//		while (!frontier.isEmpty()) {
//			Node currnet = frontier.poll();
//			if (currnet.getLabel().equals(goal)) {
//				return currnet;
//
//			} else {
//				explored.add(currnet);
//
//				List<Node> children = currnet.getChildrenNodes();
//
//				for (Node child : children) {
//					if (frontier.contains(child) && explored.contains(child)) {
//						frontier.add(child);
//						child.setParent(currnet);
//
//					}
//
//				}
//			}
//
//		}
//
//		return null;
//	}
//	
//		return null;
//	}
	public static void main(String[] args) {
		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E"); 
		Node nodeF = new Node("F");
		Node nodeG = new Node("G"); 
		Node nodeH = new Node("H");
		
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4); 
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
	}

	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node execute2(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}
}
