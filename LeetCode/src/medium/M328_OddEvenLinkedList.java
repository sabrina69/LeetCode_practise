package medium;

public class M328_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode p1 = head; // postion of odd
		ListNode p2 = head.next; // postion of even
		ListNode tempNode = head.next; // connect the odds -> evens

		while (p2 != null && p2.next != null) {
			p1.next = p2.next;
			p1 = p1.next;

			p2.next = p1.next;
			p2 = p2.next;
		}
		p1.next = tempNode;

		return head;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
