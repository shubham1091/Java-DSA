package Graphs;

import java.util.ArrayList;

public class DFS extends Basic {
    //Depth First Search
    //Keep going to the 1st neighbor
    public static void main(String[] args) {
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        search(graph,0,new boolean[v]);
    }
    static void search(ArrayList<Edge> graph[],int curr,boolean[]vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                search(graph,e.dest,vis);
            }
        }
    }
}
