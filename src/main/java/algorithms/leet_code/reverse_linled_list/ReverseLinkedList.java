package algorithms.leet_code.reverse_linled_list;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list1.setNext(list2);
        ListNode list3 = new ListNode(3);
        list2.setNext(list3);
        ListNode list4 = new ListNode(4);
        list3.setNext(list4);
        ListNode list5 = new ListNode(5);
        list4.setNext(list5);
        System.out.println(reverseLinkList(list1));
    }

    private static ListNode reverseLinkList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
