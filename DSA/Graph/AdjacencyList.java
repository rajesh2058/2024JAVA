//creating Adjacency list

import java.util.ArrayList;

public class AdjacencyList {
    static class Edge{
        int scr;
        int dest;

        public Edge(int s, int d){
            this.scr = s;
            this.dest = d;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
       for(int i =0; i<graph.length;i++){ //create empty list
        graph[i] = new ArrayList<Edge>(); //null will send error
       }
       graph[0].add(new Edge(0, 1));

       graph[1].add(new Edge(1, 2));       
       graph[1].add(new Edge(1, 3));

       graph[2].add(new Edge(2, 1));

       graph[3].add(new Edge(3, 1));
    }
    public static void main(String[] args) {
        int V =4;
        //initally array is NULL so we need to put value
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        //print 1 neighbour
        for(int i= 0; i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dest+" ");
        }

    }
}
