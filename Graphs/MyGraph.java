import java.util.ArrayList;

/**
 * MyGraph
 */
public class MyGraph {

	static void addVertex(ArrayList<ArrayList<Integer>> adjList, int u, int v) {

		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	static void printGraph(ArrayList<ArrayList<Integer>> adjList) {

		for (int i = 0; i < adjList.size(); i++) {
			System.out.println("Adjancency list of vertex " + i);
			System.out.print("head -> ");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j) + " -> ");
			}
			System.out.print("null\n");
		}
	}

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

		// make vertices first
		int i = 5;
		while (i-- != 0) {
			adjList.add(new ArrayList<Integer>());
		}
		// add vertices
		addVertex(adjList, 2, 1);
		addVertex(adjList, 2, 3);
		addVertex(adjList, 2, 0);
		addVertex(adjList, 2, 4);
		printGraph(adjList);

	}

}