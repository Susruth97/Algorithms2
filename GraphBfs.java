import java.util.*;

public class GraphBfs {
	
	static LinkedList<Integer> adj[];
	
	static int v;
	
	GraphBfs(int v) {
		this.v = v;
		
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adj[i]  = new LinkedList<Integer>();
		
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	static void getBfs(int s) {
		
		boolean visited[] = new boolean[v];
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		
		visited[s] = true;
		
		while(q.size() != 0) {
			
			int source = q.poll();
			
			System.out.println(source + " ");
			
			Iterator<Integer> itr = adj[source].listIterator();
			
			while(itr.hasNext()) {
				
				int n = itr.next();
				
				if(visited[n] == false) {
					visited[n] = true;
					q.add(n);
				}
				
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphBfs g = new GraphBfs(5);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		
		getBfs(0);

	}

}
