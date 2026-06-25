class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // --- STEP 1: COUNT THE TOTAL LENGTH OF THE LIST ---
        int sz = 0;
        ListNode temp = head;

        // Traverse the entire list until we hit null
        while(temp != null){
            temp = temp.next; // Move to the next node
            sz++;             // Increment the size counter
        }

       
        // --- STEP 2: HANDLE THE EDGE CASE ---
        // If n equals the total size, it means we need to remove the first node (the head)
        if(n == sz){
            return head.next; // Returning head.next drops the original head node
        }

        // --- STEP 3: LOCATE THE NODE BEFORE THE TARGET ---
        // Calculate how many steps from the front we need to go
        int pos = sz - n;
        ListNode prev = head;

        // Move 'prev' pointer forward until it lands exactly on the node
        // right BEFORE the one we want to delete
        for(int i = 1; i < pos; i++){
            prev = prev.next;
        }

        // --- STEP 4: DELETE THE TARGET NODE ---
        // Skip the target node by pointing 'prev.next' directly to the node after it
        prev.next = prev.next.next;

        // Return the unchanged head of the modified list
        return head;
    }
}