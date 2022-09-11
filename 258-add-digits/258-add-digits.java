class Solution {
    public int addDigits(int num) {
        if(num <= 9) return num;
        int temp = 0;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
            if(num == 0 && sum > 9){
                num = sum;
                sum =0;
            }
        }
        return sum;
    }
}