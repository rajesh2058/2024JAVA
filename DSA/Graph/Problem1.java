//all path from source to target
//this is based in both DFS and BFS 
//normally used treversial 
//
//dfs(graph,curr, string path, tar){
//if(cur = tar) {
   //print (path) //base case
   //return
//}
//now call all nebiour
//for(int i = 0 to grapth[curr].size()){
    //Edge e = graph[curr].get(i)
    //vis[curr] = True
    //dfs(graph,vis,e.dist,path_E.dest,tar)
    //vis[curr] = False
    //}
    //}
    //
//here we can visit node again and again cause
//if one target can have multiple path so
// making as visited node can be barrier for a path
//so during return mark unvisited.

import java.util.ArrayList;

public class Problem1 {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void printAllPaths(ArrayList<Edge> graph[], int src,
     int tar, String path, boolean vis[]) {
        if (src == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                printAllPaths(graph, e.dest, tar, path + "->" + e.dest, vis);
                vis[e.dest] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        /*
        1 --- 3
        /     | \
        0     | 5 -- 6
        \     | /
         2----4
        */
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0, tar = 5;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        printAllPaths(graph, src, tar, "" + src, vis);
    }
}
