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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int m=0;
        while(temp!=null){
            m++;
            temp=temp.next;
        }

        if(n==m) return head.next;

        int pos=m-n;

        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }

        if(temp!=null && temp.next!=null) temp.next=temp.next.next;

        return head;
    }
}