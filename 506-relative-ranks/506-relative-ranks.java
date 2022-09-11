class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sortedScores = descendingArray(score.clone());
        int n = score.length;
        String[] res = new String[score.length];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(score[j] == sortedScores[i]){
                    res[j] = String.valueOf(i+1);
                }
            }
        }
        for(int m=0;m<res.length;m++){
            if(res[m].equals("1")){
                res[m]="Gold Medal";
            }else if(res[m].equals("2")){
                res[m]="Silver Medal";
            }else if(res[m].equals("3")){
                res[m]="Bronze Medal";
            }
        }
        return res;
    }
    
    private int[] descendingArray(int[] array) {
    Arrays.sort(array);
    int[] descArray = new int[array.length];
    for(int i=0; i<array.length; i++) {
        descArray[i] = array[(array.length-1)-i];
    }
    return descArray;
}
}