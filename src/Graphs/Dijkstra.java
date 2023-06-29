package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

//Shortest paths from the source to all vertices (weighted graph)
public class Dijkstra extends Basic {
    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair o) {
            return this.path - o.path;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    //O(v+elog(v))
    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        boolean[] vis = new boolean[graph.length];
        int[] dist = new int[graph.length];// dist[i]-> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;// +infinity
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(src, 0));
        // loop
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                // neighbours
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    if (dist[e.src] + e.wt < dist[e.dest]) {// update distance of src to v
                        dist[e.dest] = dist[e.src] + e.wt;
                        pq.add(new Pair(e.dest, dist[e.dest]));
                    }
                }
            }
        }
        // print all source to vertices / shortest path
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        dijkstra(graph, src);
    }

}
