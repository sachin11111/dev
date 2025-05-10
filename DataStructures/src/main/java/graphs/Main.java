package graphs;

public class Main {

	public static void main(String[] args) {
		
		Graph mGraph = new Graph();
		mGraph.addVertex("A");
		mGraph.addVertex("B");
		mGraph.addVertex("C");
		mGraph.addVertex("D");
		
		mGraph.addEdge("A", "B");
		mGraph.addEdge("A", "C");
		mGraph.addEdge("A", "D");
		mGraph.addEdge("B", "D");
		mGraph.addEdge("C", "D");
		
		mGraph.printGraph();
		
		mGraph.removeVertex("D");
		
		mGraph.printGraph();
	}
	
}
