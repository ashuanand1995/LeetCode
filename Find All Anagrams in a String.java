class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] frequencyCountOfPchars = new int[128];
        for(char charInP : p.toCharArray()){
            frequencyCountOfPchars[charInP]++;
        }
        int noOfCharReqdToBeAnagram = p.length();
        int startIndex = 0, endIndex = 0;
        while(endIndex < s.length()){
            char currentChar = s.charAt(endIndex);
            if(frequencyCountOfPchars[currentChar]>=1){
                noOfCharReqdToBeAnagram--;

            }
            frequencyCountOfPchars[currentChar]--;
            endIndex++;
            if(noOfCharReqdToBeAnagram == 0){
                res.add(startIndex);
            }
            int windowsize = endIndex - startIndex;
            if(windowsize == p.length()){
                char currentStartWindowChar = s.charAt(startIndex);

                if (frequencyCountOfPchars[currentStartWindowChar] >= 0) {
                    noOfCharReqdToBeAnagram++;
                }
                frequencyCountOfPchars[currentStartWindowChar]++;
                startIndex++;
            }
        }
        return res;
}
}
