package Graphs;

import java.util.ArrayList;

//Shortest paths from the source to all vertices (negative edges)
public class Bellman extends Basic {
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void Ford(ArrayList<Edge> graph[],int src){
        int dist[]= new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int v= graph.length;
        //algo
        for(int i=0;i<v-1;i++){
            //edges -O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    //erlaxation
                    if(dist[e.src]!=Integer.MAX_VALUE && dist[e.src]+e.wt<dist[e.dest]){
                        dist[e.dest]=dist[e.src]+e.wt;
                    }
                }
            }
        }
        //print
        for(int i:dist){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        Ford(graph, 0);
    }

}
