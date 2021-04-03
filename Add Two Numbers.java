class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = null;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = 0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum += carry ;
 
            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;
 
            // update sum if it is greater than 10
            sum = sum % 10;
            ListNode node = new ListNode(sum); 
             
            if(temp == null){
                temp = result = node;
            }else{
                temp.next = node;
                temp = temp.next;
            }
        }
        if(carry > 0){
            temp.next = new ListNode(carry);            
        }
        return result;
    }
}
