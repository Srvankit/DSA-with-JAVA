
public class reorder_linked_list {
    int val;
    reorder_linked_list next;
    reorder_linked_list() {}
    reorder_linked_list(int val) { this.val = val; }
    reorder_linked_list(int val, reorder_linked_list next) { this.val = val; this.next = next; }
}


class Solution {
    public void reorderList(reorder_linked_list head) {

        //basecase
        if(head == null || head.next == null){
            return;
        }

        //find the middle 
        reorder_linked_list slow = head;
        reorder_linked_list fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }

        //sepratate second half
        reorder_linked_list second = slow.next;
        slow.next = null;

        //reverse the seond half

        reorder_linked_list prev = null;
        reorder_linked_list curr = second;
        while(curr !=null){
            reorder_linked_list next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        second = prev;

        //merge both the halves
        reorder_linked_list first = head;
        
        while(second != null){
            reorder_linked_list firstNext = first.next;
            reorder_linked_list secondNext = second.next;

        first.next = second;
        second.next = firstNext;

        first = firstNext;
        second = secondNext;
        }
    }
}
