/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*  Floyd's Algorithm:
                            There will always arrive a position where hare and turtle will meet if linked list has a bug(Element Forming rings)
    */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        while(hare != null && hare.next != null ){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle ){
                return true;
            }
        }
        return false;
        
    }
}
