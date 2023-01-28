package Graphs;

import java.util.ArrayList;

public class CCDFS extends DFS {
    static void dfs(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            dfsUtil(graph, i, vis);
        }
    }
    private static void dfsUtil(ArrayList<Edge>[]graph,int curr,boolean[]vis){
        System.out.println(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    
}
