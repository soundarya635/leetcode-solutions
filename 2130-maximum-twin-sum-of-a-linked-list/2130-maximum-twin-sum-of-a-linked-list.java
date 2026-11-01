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
    public int pairSum(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        int max=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode temp=s;
        //System.out.print(s.val);
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        
        ListNode cur=head;
        while(prev!=null){
            max=Math.max(max,prev.val+cur.val);
            prev=prev.next;
            cur=cur.next;
        }
        return max;

    }
}