import java.util.*;
public class Djixtra {
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
            for(int i=0; i<graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));
            graph[2].add(new Edge(2, 4, 3));
            graph[3].add(new Edge(3, 5, 1));
            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
        }

        static class Pair implements Comparable<Pair>{
            int node;
            int dist;

            Pair(int node, int wt){
                this.node = node;
                this.dist = wt;
            }

            @Override
            public int compareTo(Pair o) {
                return this.dist - o.dist;
            }
        }

        public static void dijkastra(ArrayList<Edge>[] graph, int src,int V){
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
            int dist[] = new int[V];
            
            boolean vis[] =new boolean[V];
            for (int i = 0; i < V; i++) {
                if(i!=src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }

            pq.add(new Pair(0,0));

            while (!pq.isEmpty()){
                Pair curr = pq.remove(); // shortest
                if(!vis[curr.node]){
                    vis[curr.node] = true;
                    for(var i: graph[curr.node]){
                        int u = i.src;
                        int v = i.dest;
                        if(dist[u] + i.wt < dist[v]){
                            dist[v] = dist[u]+i.wt;
                            pq.add(new Pair(v, dist[v]));
                        }
                    }
                }
            }

            for (int i = 0; i < V; i++) {
                System.out.println(i+" " +dist[i]);
            }
        }
        public static void main(String[] args) {
            int V = 6;
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph);
            dijkastra(graph,0,V);

        }
}
