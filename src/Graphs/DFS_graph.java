package Graphs;
import java.util.*;

public class DFS_graph {
        public static ArrayList<Integer> dfs(int n, ArrayList<Integer> ans, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
            vis[n] = true;
            ans.add(n);
            for (int i : adj.get(n)) {
                if (!vis[i]) {
                    vis[i] = true;
                    dfs(i, ans, vis, adj);
                }
            }
            return ans;
        }

        public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
            ArrayList<Integer> ans = new ArrayList<>();
            boolean[] vis = new boolean[adj.size()];
            dfs(0, ans, vis, adj);
            return ans;
        }

        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            adj.add(new ArrayList<>()); // adj[0] = [2, 3, 1]
            adj.add(new ArrayList<>()); // adj[1] = [0]
            adj.add(new ArrayList<>()); // adj[2] = [0, 4]
            adj.add(new ArrayList<>()); // adj[3] = [0]
            adj.add(new ArrayList<>()); // adj[4] = [2]

            adj.get(0).add(2);
            adj.get(0).add(3);
            adj.get(0).add(1);
            adj.get(1).add(0);
            adj.get(2).add(0);
            adj.get(2).add(4);
            adj.get(3).add(0);
            adj.get(4).add(2);

            ArrayList<Integer> result = dfsOfGraph(adj);
            for (int i : result) {
                System.out.print(i + " ");
            }
        }

}
