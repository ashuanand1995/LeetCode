class Solution {
    public boolean isPalindrome(int num) {
        int reversed = 0, original = num, remainder;
        if(num < 0) return false;
        while(num !=0){
            remainder = num%10;
            reversed = reversed*10 + remainder;
            num /= 10;
        }
        return original == reversed;
    }
}
