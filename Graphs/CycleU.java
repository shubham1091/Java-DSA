package Graphs;

import java.util.ArrayList;

public class CycleU extends CCDFS {
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] && detectCycleUtil(graph, vis, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case3
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr))
                    return true;
            }
            // case 1
            else if (vis[e.dest] && e.dest != parent) {
                return true;
            }
            // case 2 -> do nothing -> continue

        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createCycle(graph);
        System.out.println(detectCycle(graph));
        search(graph, 0, new boolean[v]);
        System.out.println();
        graph[0].remove(1);
        graph[2].remove(0);
        System.out.println(detectCycle(graph));
    }

}
