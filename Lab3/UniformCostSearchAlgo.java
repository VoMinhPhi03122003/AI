package Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class UniformCostSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<>(new Comparator<Node>() {
			List<Node> explored = new ArrayList<Node>();
         
        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();

            if (currentNode.getLabel().equals(goal)) {
               
                return currentNode;
            }
            List<Edge> children = currentNode.getChildrenNodes();
            for (Edge child : children) {
            	Node end = child.getEnd();
            	if(! frontier.contains(end)&& ! explored.contains(end)) {
            		frontier.add(end);
            		// setPathCost ?
            		end.setPathCost(currentNode.getPathCost()+ child.getWeight());
            	 }
            	else if ( end.getPathCost() > currentNode.getPathCost() + child.getWeight()) {
            		end.setPathCost(currentNode.getPathCost()+ child.getWeight());
            		end.setParent(currentNode);
            		
            	}
            	
            }
				
			}


}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node execute1(Node root, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node execute2(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}
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
		
		System.out.println(Node execute());
	
		
	}

}
