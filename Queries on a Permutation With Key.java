class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        int[] P = new int[m];
        for(int i=0;i < m;i++){
            P[i] = i+1;
        }
        for(int j = 0; j < queries.length ; j++){
            int curr = queries[j];
            int idx = getArrayIndex(P,curr);
            for (int k = (idx - 1); k >= 0; k--) {                
                P[k+1] = P[k];
            }
            P[0] = curr;
            res[j] = idx;
        }
        return res;
    }
    
    public int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
}
}
