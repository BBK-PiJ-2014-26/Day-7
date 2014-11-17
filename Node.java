public class Node {

	private String data;
	private Node next;
	private Node previous;

	public Node(String data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public void addFirst(Node node) {
		this.next = node;
		node.previous = this;
	}

	public void addNode(Node node) {
		if (this.next == null) {
			this.next = node;
			node.previous = this;
		} else {
			this.next.addNode(node);
		}
	}

	public String getData() {
		return data;
	}

	public void printListForwards() {
		if (next != null) {
			System.out.println(this.getData());
			next.printListForwards();
		} else {
			System.out.println(this.getData());
		}
	}

	public void printListBackwards() {
		if (previous != null) {
			System.out.println(this.getData());
			previous.printListBackwards();
		} else {
			System.out.println(this.getData());
		}
	}

	public boolean deleteNode(Node node) {
		if (this.next == null) {
			return false;
		} else if (this.next.data.equals(node.data)) {
			this.next = next.next;
			next.previous = this;
			return true;
		} else {
			return this.next.deleteNode(node);
		}
	}
			
}
