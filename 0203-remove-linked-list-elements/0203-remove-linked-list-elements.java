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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null) return null;
        while(head!=null) {
            if(head.val==val) head=head.next;else{
                break;
            }
        } 
        ListNode temp=head;
        if(temp==null) return null;
        while(temp.next!=null){
            
            if(temp.next.val==val) {
                if(temp.next.next!=null) temp.next=temp.next.next;
                else temp.next=null;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}