/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int n=0;
        if(head==null || head.next==null){
            return null;
        }
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int mid = n/2;

        temp = head;
        while(mid>1){
            temp=temp.next;
            mid--;
        }
        temp.next=temp.next.next;
        return head;
    }
}