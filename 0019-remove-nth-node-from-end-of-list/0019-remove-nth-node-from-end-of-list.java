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

        // sz = 5 (total nodes: [10]->[20]->[30]->[40]->[50])
        // n  = 2 (we want to remove the 2nd node from the end, which is [40])

        // Calculate the 1-based position from the front where we need to STOP.
        // pos = 5 - 2 = 3. 
        // This tells us the node we want to stand on is the 3rd node from the front ([30]).
        int pos = sz - n;

        // Initialize our tracker pointer at the very beginning of the list.
        // At this exact moment: prev is pointing to the 1st node ([10]).
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