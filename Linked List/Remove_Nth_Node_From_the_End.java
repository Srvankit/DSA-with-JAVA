
public class Remove_Nth_Node_From_the_End {
    int val;
    Remove_Nth_Node_From_the_End next;
    Remove_Nth_Node_From_the_End() {}
    Remove_Nth_Node_From_the_End(int val) { this.val = val; }
    Remove_Nth_Node_From_the_End(int val, Remove_Nth_Node_From_the_End next) { this.val = val; this.next = next; }
}


class Solution {
    public Remove_Nth_Node_From_the_End removeNthFromEnd(Remove_Nth_Node_From_the_End head, int n) {
        int length = 0;
        Remove_Nth_Node_From_the_End curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        if(n==length){
            return head.next;
        }

        Remove_Nth_Node_From_the_End rev = head;
        for(int i=1; i<(length-n);i++){
            rev= rev.next;
        }
        rev.next  = rev.next.next;

        return head;
    }
}
