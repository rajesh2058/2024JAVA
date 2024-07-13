
   //creating Adjacency list

   import java.util.ArrayList;
public class AdjacencyListWeight {
    static class Edge{
        int scr;
        int dest;
        int wt;

        public Edge(int s, int d,int w){
            this.scr = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
       for(int i =0; i<graph.length;i++){ //create empty list
        graph[i] = new ArrayList<Edge>(); //null will send error
       }
       graph[0].add(new Edge(0, 1,5));

       graph[1].add(new Edge(1, 2,10));       
       graph[1].add(new Edge(1, 3,15));

       graph[2].add(new Edge(2, 1,11));

       graph[3].add(new Edge(3, 1,9));
    }
    public static void main(String[] args) {
        int V =4;
        //initally array is NULL so we need to put value
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        //print 1 neighbour
        for(int i= 0; i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }

    }
}
 
