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
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryBuilder = new StringBuilder();
        ListNode current = head;
        while(current != null) {
            binaryBuilder.append(current.val);

            current = current.next;
        }

        return Integer.parseInt(binaryBuilder.toString(), 2);
    }
}
