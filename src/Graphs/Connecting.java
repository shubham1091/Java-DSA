package Graphs;

import java.util.PriorityQueue;

public class Connecting {
    /*
     * Connecting Cities with Minimum cost
     * Find the minimum cost for connecting all cities on the map.
     * cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,}}
     * ans=10
     */
    static class Edge implements Comparable<Edge> {
        int dest, cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int connect(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        boolean vis[] = new boolean[cities.length];
        pq.add(new Edge(0, 0));
        int finalcost = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalcost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }

        return finalcost;
    }

    public static void main(String[] args) {
        int cities[][] = {
                { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, }
        };

        System.out.println(connect(cities));
    }
}
