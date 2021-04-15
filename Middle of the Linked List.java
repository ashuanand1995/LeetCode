class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode traversalNode = head;
        while(traversalNode!=null){
            length++;
            traversalNode = traversalNode.next;
        }
        int midValue = length/2;
        ListNode newNode = head;
        int i =0;
        while(i<midValue){
            i++;
            newNode = newNode.next;            
        }
        return newNode;
    }
}
