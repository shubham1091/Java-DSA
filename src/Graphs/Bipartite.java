package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* 
* Bipartite Graph
* A Bipartite Graph is a graph whose vertices can be divided into 
* two independent sets, U and V such that every edge (u,v) either 
* connects a vertex from U to V or a vertex from V to U. In orther
* words, for every edge (u,v), either u belongs to U and v to V. 
* Ubelongs to V and v to U. We can also say that there is no edge 
* that connects vertices of same set.
*/

public class Bipartite {
    static class Edge {
        int s, d;

        public Edge(int s, int d) {
            this.s = s;
            this.d = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;// no color
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {// BFS
                q.add(i);
                col[i] = 0;// Yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);// e.dest
                        if (col[e.d] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.d] = nextCol;
                            q.add(e.d);
                        } else if (col[e.d] == col[curr]) {
                            return false;// Not bipartite
                        }

                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }

}
