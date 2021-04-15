class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        ListNode prev1 =  new ListNode();
        for(int i = 0; i < a; i++){
            prev1 = head1;
            head1 = head1.next;
        }
        //head1 = prev1;
        for(int j = a; j<b ; j++){
            head1 = head1.next;
        }
        ListNode tail2 = list2;
        while(tail2.next!=null){
            tail2 = tail2.next;
        }
        prev1.next = list2;
        tail2.next = head1.next;
        return list1;
    }
}
