package backend.dataStructures;

public class HashTable<T> {

	class Node{
		int key;
		T value;
		Node next;

		Node(int key, T value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	private Object[] table;
	private int capacity;
	private int size;

	public HashTable(int capacity){
		this.capacity = capacity;
		this.size = 0;
		this.table =  new Object[capacity];
	}

	int hash(int key) {
		return key % capacity;
	}


	public void put(int key, T value) {
		int index = hash(key);
		Node newNode = new Node(key,value);

		if(table[index] == null) {
			table[index] = newNode;
		}
		else {
			Node curr = (Node)table[index];
			while(curr.next != null) {
				if(curr.key == key) {
					curr.value = value;
					return;
				}
				curr = curr.next;
			}
			curr.next = newNode;
		}
		size++;
	}

	public T get(int key) {
		int index = hash(key);
		Node curr  = (Node)table[index];
		while(curr != null) {
			if (curr.key == key){
				return curr.value;
			}
			curr=curr.next;
		}
		return null;
	}

	public LinkedList<T> getAll() {
		LinkedList<T> allValues = new LinkedList<>();

		for (int i = 0; i < capacity; i++) {
			Node current = (Node) table[i];
			while (current != null) {
				allValues.add(current.value);
				current = current.next;
			}
		}
		return allValues;
	}

	public boolean containsKey(int key) {
		int index = hash(key);
		Node curr = (Node)table[index];
		while(curr != null) {
			if(curr.key == key) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public void remove(int key) {
		int index = hash(key);
		Node curr = (Node)table[index];
		Node prev = null;

		while(curr != null) {
			if(curr.key == key) {
				if(prev == null) {
					table[index] = curr.next;
				}else {
					prev.next = curr.next;
				}
				size--;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	public int size() {
		return size;
	}
}
