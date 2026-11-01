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
    public ListNode reverseBetween(ListNode head, int left, int r) {
        ListNode cur=head;
        ListNode start=head;
        for(int i=1;i<left;i++ ){
           start=cur;
            cur=cur.next;
        }
        ListNode prev=null;
        ListNode last=cur;
        r-=left;
        while(cur!=null && r>=0){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            r--;
        }
        last.next=cur;
        if(last!=start) {start.next=prev;
        
        return head;
        }
        return prev;

    }
}