package Lab9;

import java.util.Arrays;
import java.util.List;

public class TestNode {
	public static void main(String[] args) {
		Node node = new Node();
		Integer[] data = { 5 };
		node.addAll(Arrays.asList(data));

		MinimaxAlgo algo = new MinimaxAlgo();
		System.out.println("Numbers of tokens = 5");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best Next Move for Min :" + node.getBestNextMove());
		
		data[0] = 6;
		node.clear();
		node.addAll(Arrays.asList(data));
		System.out.println("Numbers of tokens = 6");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best next move for MIN: " + node.getBestNextMove());
		System.out.println("——————————————————————————————————");

		data[0] = 7;
		node.clear();
		node.addAll(Arrays.asList(data));
		System.out.println("Numbers of tokens = 7");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best next move for MIN: " + node.getBestNextMove());	
}
}