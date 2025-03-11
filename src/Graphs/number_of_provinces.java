package Graphs;
import java.util.*;

public class number_of_provinces {
        public static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs,int vis[]) {
            vis[node] = 1;
            for(Integer it: adjLs.get(node)) {
                if(vis[it] == 0) {
                    dfs(it, adjLs, vis);
                }
            }
        }
        static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
            ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
            for(int i = 0;i<V;i++) {
                adjLs.add(new ArrayList<Integer>());
            }

            for(int i = 0;i<V;i++) {
                for(int j = 0;j<V;j++) {
                    if(adj.get(i).get(j) == 1 && i != j) {
                        adjLs.get(i).add(j);
                        adjLs.get(j).add(i);
                    }
                }
            }
            int vis[] = new int[V];
            int cnt = 0;
            for(int i = 0;i<V;i++) {
                if(vis[i] == 0) {
                    cnt++;
                    dfs(i, adjLs, vis);
                }
            }
            return cnt;
        }

        public static void main(String[] args)
        {
            ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
            adj.add(new ArrayList<Integer>());
            adj.get(0).add(0, 1);
            adj.get(0).add(1, 0);
            adj.get(0).add(2, 1);
            adj.add(new ArrayList<Integer>());
            adj.get(1).add(0, 0);
            adj.get(1).add(1, 1);
            adj.get(1).add(2, 0);
            adj.add(new ArrayList<Integer>());
            adj.get(2).add(0, 1);
            adj.get(2).add(1, 0);
            adj.get(2).add(2, 1);


            System.out.println(numProvinces(adj,3));
        }
}
