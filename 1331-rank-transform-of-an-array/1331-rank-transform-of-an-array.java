class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] cl = arr.clone();
        Arrays.sort(cl);
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : cl){
            map.putIfAbsent(num, map.size()+1);
        }
        for(int i=0;i<n;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}