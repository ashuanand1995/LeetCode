class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<String>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        
        Queue<String> changeQueue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        changeQueue.add(beginWord);
        visited.add(beginWord);
        
        int changes = 1;
        
        while(!changeQueue.isEmpty()){
            int size = changeQueue.size();
            
            for(int i=0;i<size;i++){
                String currWord = changeQueue.poll();
                if(currWord.equals(endWord)) return changes;
                
                
                for(int j=0;j<currWord.length();j++){
                    for(int k = 'a';k<='z';k++){
                        char[] word = currWord.toCharArray();
                        word[j] = (char) k;
                        String newWord = new String(word);
                        if(wordSet.contains(newWord) && !visited.contains(newWord)){
                            visited.add(newWord);
                            changeQueue.add(newWord);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;
    }
}