package Graphs;
import java.util.*;

public class BFS_graph {
        public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[V];
            ArrayList<Integer> ans = new ArrayList<>();
            vis[0] = true;
            q.add(0);

            while (!q.isEmpty()) {
                int node = q.poll();
                ans.add(node);
                for (int i : adj.get(node)) {
                    if (!vis[i]) {
                        vis[i] = true;
                        q.add(i);
                    }
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int V = 5;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            adj.get(0).add(1);
            adj.get(0).add(2);
            adj.get(1).add(0);
            adj.get(1).add(3);
            adj.get(2).add(0);
            adj.get(2).add(4);
            adj.get(3).add(1);
            adj.get(4).add(2);
            ArrayList<Integer> result = bfsOfGraph(V, adj);
            System.out.println(result);
        }

}
