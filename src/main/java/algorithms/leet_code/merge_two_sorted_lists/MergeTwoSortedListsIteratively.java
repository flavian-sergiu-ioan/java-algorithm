package algorithms.leet_code.merge_two_sorted_lists;

public class MergeTwoSortedListsIteratively {

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode prev = new ListNode(-1);
          ListNode curr = prev;

          while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
          }

          curr.next = list1 == null ? list2 : list1;
          return prev.next;
    }


}
