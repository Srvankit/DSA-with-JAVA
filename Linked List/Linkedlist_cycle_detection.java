
public class Linkedlist_cycle_detection {
    int val;
    Linkedlist_cycle_detection next;
    Linkedlist_cycle_detection() {}
    Linkedlist_cycle_detection(int val) { this.val = val; }
    Linkedlist_cycle_detection(int val, Linkedlist_cycle_detection next) { this.val = val; this.next = next; }
}
 

class Solution {
    public boolean hasCycle(Linkedlist_cycle_detection head) {
        Linkedlist_cycle_detection fast = head;
        Linkedlist_cycle_detection slow = head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
            return true;
            }
        }
        return false;
    }
}
