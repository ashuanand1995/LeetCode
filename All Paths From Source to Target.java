class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        path.add(0);
        dfs(graph, 0, path, res);
        return res;
    }

    private void dfs(int[][] graph, int index, List<Integer> path, List<List<Integer>> res) {
        if (index == graph.length - 1) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int neigh : graph[index]) {
            path.add(neigh);
            dfs(graph, neigh, path, res);
            // Backtracking
            path.remove(path.size() - 1);
        }
    }
}
