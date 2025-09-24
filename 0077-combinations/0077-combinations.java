class Solution {

    public void backtrack(int n, List<List<Integer>> result, int k, int st, List<Integer> temp) {
        if (temp.size() == k) {  
            result.add(new ArrayList<>(temp));  
            return;
        }

        for (int i = st; i <= n; i++) {
            temp.add(i);
            backtrack(n, result, k, i + 1, temp);  
            temp.remove(temp.size() - 1);  
        }
    }

    public List<List<Integer>> combine(int n, int k) {  
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, result, k, 1, new ArrayList<>());
        return result;
    }
}
