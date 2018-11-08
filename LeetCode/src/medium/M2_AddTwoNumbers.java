package medium;

public class M2_AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode first = l1;
		ListNode second = l2;
		ListNode dummy = new ListNode(-1);
		ListNode result = dummy;

		int newVal = 0;

		while (first != null || second != null) {

			if (first != null) {
				newVal += first.val;
				first = first.next;
			}

			if (second != null) {
				newVal += second.val;
				second = second.next;
			}

			result.next = new ListNode(newVal % 10);
			result = result.next;
			newVal = newVal / 10;
		}

		if (newVal == 1)
			result.next = new ListNode(1);

		return dummy.next;

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
