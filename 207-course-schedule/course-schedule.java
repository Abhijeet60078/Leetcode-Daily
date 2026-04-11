import java.util.*;

class Solution {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();

        for (int[] vec : prerequisites) {
            int v = vec[1];
            int u = vec[0];

            adj.putIfAbsent(u, new ArrayList<>());
            adj.get(u).add(v);
        }

        return solve(adj, numCourses);
    }

    private boolean solve(HashMap<Integer, List<Integer>> adj, int n) {

        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, pathVis)) {
                    return false; // cycle found
                }
            }
        }

        return true; // no cycle
    }

    private boolean dfs(int node, HashMap<Integer, List<Integer>> adj,
                        boolean[] vis, boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true;

        if (adj.containsKey(node)) {
            for (int neighbor : adj.get(node)) {

                if (!vis[neighbor]) {
                    if (dfs(neighbor, adj, vis, pathVis)) {
                        return true;
                    }
                } 
                else if (pathVis[neighbor]) {
                    return true; // cycle detected
                }
            }
        }

        pathVis[node] = false;
        return false;
    }
}