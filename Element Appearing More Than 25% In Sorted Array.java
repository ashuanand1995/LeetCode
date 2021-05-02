class Solution {
    public int findSpecialInteger(int[] arr) {
        int quarter = arr.length/4;
        HashMap<Integer,Integer> countMap =new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            if(!countMap.containsKey(arr[i])){
                countMap.put(arr[i],1);
            }else{
                int val = countMap.get(arr[i]);
               countMap.put(arr[i],++val); 
            }
            if(countMap.get(arr[i])>quarter) {
                return arr[i];
        }
       
    }
        return -1; 
}
}
