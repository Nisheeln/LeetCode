class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases cleanly (like removing head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move fast ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both fast and slow until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Skip the target node
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
