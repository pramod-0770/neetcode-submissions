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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if(list1 == null && list2 == null){
         return null;
      }
      if(list2 == null){
         return list1;
      }
      else if(list1 == null){
         return list2;
      }
      List<Integer> L1 = new ArrayList<>();
      List<Integer> L2 = new ArrayList<>();
      List<Integer> L3 = new ArrayList<>();
      ListNode curr = list1;
     
      while(curr != null){
         L1.add(curr.val);
         curr = curr.next;
        
      }
      ListNode curr2 = list2;
      
      while(curr2 != null){
         L2.add(curr2.val);
         curr2 = curr2.next;
         
      }
      int l = 0;
      int r = 0;
      while(l < L1.size() && r < L2.size()){
         if(L1.get(l) < L2.get(r)){
            L3.add(L1.get(l));
            l++;
         }
         else{
            L3.add(L2.get(r));
            r++;
         }
        
      }
       while(r < L2.size()){
            L3.add(L2.get(r));
            r++;
         }
         while(l < L1.size()){
            L3.add(L1.get(l));
            l++;
         }
      ListNode head = new ListNode();
      head.val = L3.get(0);
      curr = head;
      for(int i = 1; i < L3.size();  i++){
         ListNode newNode = new ListNode();
         newNode.val =  L3.get(i);
         curr.next = newNode;
         curr = curr.next;

      }
      return head;

     



        
    }
}