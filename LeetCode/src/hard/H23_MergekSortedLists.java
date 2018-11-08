package hard;

public class H23_MergekSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		return mergeKLists(lists, 0, lists.length - 1);
	}

	public ListNode mergeKLists(ListNode[] lists, int l, int h) {
		if (l > h)
			return null;
		if (l == h)
			return lists[l];
		if (h - l == 1)
			return merge2Lists(lists[l], lists[h]);
		int mid = l + (h - l) / 2;
		return merge2Lists(mergeKLists(lists, l, mid), mergeKLists(lists, mid + 1, h));
	}

	ListNode merge2Lists(ListNode a, ListNode b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		ListNode dummy = new ListNode(-1), tmp = dummy;
		while (a != null && b != null) {
			if (a.val <= b.val) {
				tmp.next = a;
				tmp = a;
				a = a.next;
			} else {
				tmp.next = b;
				tmp = b;
				b = b.next;
			}
		}
		if (a == null)
			tmp.next = b;
		if (b == null)
			tmp.next = a;
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
