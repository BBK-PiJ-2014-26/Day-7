public class DoublyLinkedList {

	public static void main(String[] args) {

		Node node1 = new Node("first"); 
		Node node2 = new Node("second"); 
		node1.addFirst(node2);
		Node node3 = new Node("third"); 
		node1.addNode(node3);
		Node node4 = new Node("fourth"); 
		node3.addNode(node4);
		Node node5 = new Node("fifth"); 
		node4.addNode(node5);
		Node node6 = new Node("sixth"); 
		node5.addNode(node6);
		Node node7 = new Node("seventh"); 
		node6.addNode(node7);
		Node node8 = new Node("eighth"); 
		node7.addNode(node8);
		Node node9 = new Node("ninth"); 
		node8.addNode(node9);
		Node node10 = new Node("tenth"); 
		node9.addNode(node10);
		node1.printListForwards();
		node8.deleteNode(node9);
		node1.deleteNode(node3);
		node10.printListBackwards();
		Node node11 = new Node("eleventh");
		node1.addNode(node11);
		node1.printListForwards();
		Node node12 = new Node("twelth");
		node1.deleteNode(node12);
		node1.printListForwards();
		node11.printListBackwards();
	}

}