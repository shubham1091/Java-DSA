package Graphs;

import java.util.ArrayList;

public class HasPath extends DFS {
    /*
     * Has Path?
     * For given src & dest, tell if a path exists from src to dest
     */
    public static void main(String[] args) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(path(graph, 5, 0, new boolean[v]));

    }

    static boolean path(ArrayList<Edge> graph[], int des, int curr, boolean[] vis) {
        if (curr == des) {
            return true;
        }
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest] && path(graph, des, e.dest, vis)) {
                return true;
            }
        }
        return false;

    }
}
