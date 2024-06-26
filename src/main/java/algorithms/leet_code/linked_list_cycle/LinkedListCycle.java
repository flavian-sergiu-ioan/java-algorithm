package algorithms.leet_code.linked_list_cycle;


public class LinkedListCycle {

    public static void main(String[] args) {
       ListNode lis1 = new ListNode(3);
       ListNode lis2 = new ListNode(2);
       ListNode lis3 = new ListNode(0);
       ListNode lis4 = new ListNode(-4);
       lis1.setNext(lis2);
       lis2.setNext(lis3);
       lis3.setNext(lis4);
       lis4.setNext(lis2);

       System.out.println(hasCycle(lis1)==true);

        ListNode lis5 = new ListNode(1);
        ListNode lis6 = new ListNode(2);
        lis5.setNext(lis6);
        lis6.setNext(lis5);

        System.out.println(hasCycle(lis5)==true);

        ListNode lis7 = new ListNode(1);

        System.out.println(hasCycle(lis7)==false);
    }

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
