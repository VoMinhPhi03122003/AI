package Lab7;

public class Test {
	public static void main(String[] args) {
		GA_NQueenAlgo ga = new GA_NQueenAlgo();
		
		Node he = ga.execute();
		System.out.println("H = " + he.getH());
		he.displayBoard();
		
	}

}
