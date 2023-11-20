package Queen;
import sa_tsp.*;
public class TestSA {

	public static void main(String[] args) {
		Node initialState = new Node();
		initialState.displayBoard();
		System.out.println("H = " + initialState.getH());
		SimulatedAnnealing sa = new SimulatedAnnealing();
		System.out.println("————————————————————");

		Node re = sa.execute(initialState, 1000, 0.995);
		System.out.println("H = " + re.getH());
		re.displayBoard();

	
	}

}