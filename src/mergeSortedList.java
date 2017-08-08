/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode l3;
      ListNode pos;
      pos = l3;
      
      while( l1 && l2 ){
        if( l1.value <= l2.value ){
          ListNode temp = new ListNode( l1.value );
          l1 = l1.next;
          pos = temp;
          pos = temp.next;
        }
        else{
          ListNode temp = new ListNode( l2.value );
          l2 = l2.next;
          pos = temp;
          pos = temp.next;
        }
 
      }
      if( l1 != null )
        pos = l1;
      
      if( l2 != null )
        pos = l2;
      
      return l3;
      
    }
}
