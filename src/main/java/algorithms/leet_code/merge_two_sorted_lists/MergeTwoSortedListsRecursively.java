package algorithms.leet_code.merge_two_sorted_lists;

public class MergeTwoSortedListsRecursively {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        list1.setNext(l2);
        ListNode l3 = new ListNode(4);
        l2.setNext(l3);

        System.out.println(list1);


        ListNode list2 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        list2.setNext(l4);
        ListNode l5 = new ListNode(4);
        l4.setNext(l5);

        System.out.println(list2);

        System.out.println(mergeTwoLists(list1, list2));
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
