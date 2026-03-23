class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int sz = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

       
        if(n == sz){
            return head.next;
        }

        int pos = sz - n;
        ListNode prev = head;

        for(int i = 1; i < pos; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}