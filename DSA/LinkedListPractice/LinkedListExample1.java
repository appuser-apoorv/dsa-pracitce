package LinkedListPractice;
//Reverse a given linked list.
//🔹 Input: 1 → 2 → 3 → 4 → 5
//🔹 Output: 5 → 4 → 3 → 2 → 1

public class LinkedListExample1 {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        ListNode originalList = head;
        while (originalList !=null)
        {
            System.out.println(originalList.val);
            originalList = originalList.next;
        }
        System.out.println("Reversed List: ");
        ListNode reversedList = reverse(head);
        while (reversedList != null) {
            System.out.println(reversedList.val);
            reversedList = reversedList.next;
        }
    }
}
