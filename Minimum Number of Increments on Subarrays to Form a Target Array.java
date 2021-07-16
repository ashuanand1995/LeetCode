class Solution {
    public int minNumberOperations(int[] target) {
        int res = 0, prev = 0;
        for (int el : target) {
            res += Math.max(0, el - prev);
            prev = el;
        }
        return res;
    }
}
