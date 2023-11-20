package Lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class GA_NQueenAlgo {
	public static final int POP_SIZE = 100;// Population size
	public static final double MUTATION_RATE = 0.03;
	public static final int MAX_ITERATIONS = 1000;
	List<Node> population = new ArrayList<Node>();
	Random rd = new Random();

	// initialize the individuals of the population
	public void initPopulation() {
		for (int i = 0; i < POP_SIZE; i++) {
			Node ni = new Node();
			ni.generateBoard();
			population.add(ni);
		}
	}

	public Node execute() {
		int repeat = MAX_ITERATIONS;
		Node x ,y;
		Node child = null;
		List<Node> pop = new ArrayList<>();
		
		while (repeat > 0) {
			for (int i = 0; i <population.size(); i++) {
				x = getParentByRandomSelection();
				y = getParentByRandomSelection();
				while(x==y) {
					y = getParentByRandomSelection();
					
					child = reproduce(x,y);
					if(Math.random()<= MUTATION_RATE)
						mutate(child);
					
					if(child.getH()==0)
						return child;
					pop.add(child);
					
				}
				population.clear();
				population.addAll(pop);
				pop.clear();
				repeat--;
				
			}
		}
		return new TreeSet<Node>(population).first();
		}

	// Mutate an individual by selecting a random Queen and
	// move it to a random row.
	public void mutate(Node node) {
		int i = rd.nextInt(Node.N);
		int r = rd.nextInt(Node.N);
		node.setRow(i, r);

	}

	// Crossover x and y to reproduce a child
	public Node reproduce(Node x, Node y) {
		int c = rd.nextInt(Node.N - 1) + 1;
		Node n = new Node();
		n.generateBoard();

		for (int i = 0; i < Node.N; i++) {
			if (i < c)
				n.setRow(i, x.getRow(i));
			else
				n.setRow(i, y.getRow(i));

		}

		return n;
	}

	// Select K individuals from the population at random and
	// select the best out of these to become a parent.
	public Node getParentByTournamentSelection(int k) {
		if (k <= 0) {
			return null;
		}
		Node re = population.get(rd.nextInt(POP_SIZE));
		Node tmp;
		for (int i = 0; i < k; i++) {
			do
				tmp = population.get(rd.nextInt(POP_SIZE));
			while(tmp == re);
			if(tmp.getH()<re.getH())
				re = tmp;
		}
			return re;
		}

	

	// Select a random parent from the population
	public Node getParentByRandomSelection() {
	
		return population.get(rd.nextInt(population.size()));
	}
}
