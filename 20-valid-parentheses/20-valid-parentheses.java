class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char rev = getReversedBracket(c);
            if(isLeftParentheses(c)){
                stck.push(c);
            }else if(stck.isEmpty() || !(stck.pop()==rev)) {
                return false;
                }
            }
        return stck.isEmpty();    
    }
    
    
    
    public boolean isLeftParentheses(char c){
        if(c=='['||c=='{'||c=='('){
            return true;
        }
        return false;
    }
    
    public char getReversedBracket(char c){
        if(c=='[') return ']';
        if(c=='{') return '}';
        if(c=='(') return ')';
        if(c==']') return '[';
        if(c=='}') return '{';
        if(c==')') return '(';
        return ' ';
    }
}