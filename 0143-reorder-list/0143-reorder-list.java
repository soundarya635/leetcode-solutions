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
    public void reorderList(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode pre=null;
        ListNode dummy=s.next;
        s.next=null;
        while(dummy!=null){
            ListNode n=dummy.next;
            dummy.next=pre;
            pre=dummy;
            dummy=n;
        }
        ListNode temp=head;
        while(pre!=null && temp !=null){
            ListNode d=temp.next;
            temp.next=pre;
            pre=pre.next;
            temp.next.next=d;
            temp=d;
        }
        
    }
}