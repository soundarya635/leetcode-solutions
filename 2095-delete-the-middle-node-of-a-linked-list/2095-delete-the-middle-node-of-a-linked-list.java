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
        ListNode s=head;
        ListNode f=head;
        ListNode pre=null;
        if(s.next==null) return null;
        if(s.next.next==null);
        while(f!=null && f.next!=null){
            pre=s;
            s=s.next;
            f=f.next.next;
        }
        pre.next=s.next;
        return head;
    }
}