package hard;

import java.util.HashMap;
import java.util.Map;

public class H146_LRU {

    private Map<Integer, Node> map;
    private int capacity;
    private Node dummy;
    private Node tail;

    public H146_LRU(int cap) {
        capacity = cap;
        map = new HashMap<>();
        dummy = new Node(-1, -1); 
        tail = new Node(-1, -1); 
        dummy.next = tail;
        tail.prev = dummy;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);


            node.prev.next = node.next;
            node.next.prev = node.prev;


            addToTail(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (get(key) != -1) {
            map.get(key).val = value;
            return;
        }


        if (map.size() == capacity) {
            removeHead();
        }

        Node node = new Node(key, value);
        addToTail(node);
        map.put(key, node);
    }

    private void addToTail(Node curr) {

        tail.prev.next = curr;
        curr.prev = tail.prev;
        curr.next = tail;
        tail.prev = curr;
    }

    private void removeHead() {

        Node head = dummy.next;
        dummy.next = head.next;
        head.next.prev = dummy;
        map.remove(head.key);
    }

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int k, int v) {
            key = k;
            val = v;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
