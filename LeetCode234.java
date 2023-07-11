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
 /* Palindromic Liked List
      Steps : 1-Middle of LL
              2-2nd half reverse
              3-Compare first and second half
    */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public ListNode findmiddle(ListNode head){
        // Hair turtle strategy
        ListNode hare = head;
        ListNode turtle= head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        // Below line will find the end of the first half
        ListNode firstHalfEnd = findmiddle(head);
        // Below line will reverse the entire second half of array and will point to the last element of original list
        ListNode sHS = reverse(firstHalfEnd.next);

        ListNode start = head;
        // Logic for comparing the other two lists
        while(sHS != null){
            if(start.val != sHS.val){
                return false;
            }
            start = start.next ;
            sHS = sHS.next;
        }
        return true;
    }
}
