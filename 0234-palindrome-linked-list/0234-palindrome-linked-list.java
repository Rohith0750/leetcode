/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    
     // find the middle of the linked list.
      //(Slow and Fast pointers).
     
    public ListNode findmid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;      
            fast = fast.next.next;  
        }
        return slow; // Returns the starting node of the second half
    }
    
   
     // Main method to check if the linked list is a palindrome.
     
    public boolean isPalindrome(ListNode head) {
        // Base case: An empty list or a list with a single node is always a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle node of the linked list
        ListNode midnode = findmid(head);
        
        // Step 2: Reverse the second half of the linked list starting from 'midnode'
        ListNode prev = null;
        ListNode curr = midnode;
        ListNode next;
        
        while (curr != null) {
            next = curr.next;    // Temporarily store the next node
            curr.next = prev;    // Reverse the current node's pointer
            prev = curr;         // Move 'prev' one step forward
            curr = next;         // Move 'curr' one step forward
        }
        
        // Step 3: Compare both halves
        ListNode right = prev; // 'prev' now points to the head of the reversed second half
        ListNode left = head;  // 'left' starts at the head of the original list

        // Compare values from the left half and the reversed right half
        while (right != null) {
            // If any values mismatch, it's not a palindrome
            if (left.val != right.val) {
                return false; 
            }
            left = left.next;   // Move left pointer forward
            right = right.next; // Move right pointer forward
        }
        
        // If the loop finishes without returning false, the list is a palindrome
        return true;
    }
}