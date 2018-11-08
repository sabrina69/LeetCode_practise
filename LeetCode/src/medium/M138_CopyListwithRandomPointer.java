package medium;

import java.util.HashMap;

public class M138_CopyListwithRandomPointer {

	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return null;
		}
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.label);
		RandomListNode p = head;
		RandomListNode q = newHead;
		map.put(p, q);
		p = p.next;
		while (p != null) {
			RandomListNode temp = new RandomListNode(p.label);
			map.put(p, temp);
			p = p.next;
			q.next = temp;
			q = temp;
		}
		p = head;
		q = newHead;
		while (p != null) {
			if (p.random != null) {
				q.random = map.get(p.random);
			} else {
				q.random = null;
			}
			p = p.next;
			q = q.next;
		}
		return newHead;
	}

	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
