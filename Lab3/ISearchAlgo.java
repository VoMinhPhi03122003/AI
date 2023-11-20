package Lab3;

public interface ISearchAlgo {
	public Node execute(Node root, String goal);// find the path from root node to the goal node

	public Node execute(Node root, String start, String goal); // find the path from start node to the goal node

	Node execute1(Node root, String goal);

	Node execute2(Node root, String start, String goal);

}
