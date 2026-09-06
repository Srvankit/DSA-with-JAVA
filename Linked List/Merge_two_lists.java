public class Merge_two_lists {
    int val;
    Merge_two_lists next;
    Merge_two_lists() {}
    Merge_two_lists(int val) { this.val = val; }
    Merge_two_lists(int val, Merge_two_lists next) { this.val = val; this.next = next; }
}
 

class Solution {
    public Merge_two_lists mergeTwoLists(Merge_two_lists list1, Merge_two_lists list2) {
        Merge_two_lists ans = new Merge_two_lists();
        Merge_two_lists curr = ans;

        Merge_two_lists curr1 = list1;
        Merge_two_lists curr2 = list2;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                curr.next = curr1;
                curr1= curr1.next;
            }
            else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr= curr.next;
        }
            if(curr1 != null){
                curr.next = curr1;
            }
            else{
                curr.next = curr2;
            }
        
        return ans.next;
    }
}
