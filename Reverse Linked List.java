class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode forward = head;
        ListNode prev = null;
        while(curr!=null){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;            
        }
        return prev;
    }
}
