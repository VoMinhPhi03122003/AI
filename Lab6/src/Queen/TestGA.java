package Queen;
import Queen.*;
import sa_tsp.*;
public class TestGA {

	public static void main(String[] args) {
		GeneticAlgo ga = new GeneticAlgo();

		Node re = ga.execute();
		System.out.println("H = " + re.getH());
		re.displayBoard();
		
	
}
}