package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Basic {
    //Breadth first search
    
    public static void search(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//source=0;

        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        search(graph);
    }

}
