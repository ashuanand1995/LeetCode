import java.lang.Math;
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        temp = head;
        int sum = 0;
        for(int i=length-1;i>=0;i--){
            int power = (int) Math.pow(2,i);
            sum += (temp.val * power);
            temp = temp.next;
        }
        return sum;
    }
}
