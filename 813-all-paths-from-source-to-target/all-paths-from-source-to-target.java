class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(graph,0,path,list);
        return list;




        
    }
    public void  dfs(int[][] graph,int node,List<Integer> path,List<List<Integer>> list){
        if(node==graph.length-1){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int neighbour:graph[node]){
            path.add(neighbour);
            dfs(graph,neighbour,path,list);
            path.remove(path.size()-1);

        }


    }
}