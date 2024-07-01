package algorithms.leet_code.reverse_linled_list;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
