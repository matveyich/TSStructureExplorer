
public class Tree {

	/**
	 * @param args
	 */
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeRoot = new Node(100);
		nodeRoot.addItem(new Item(5));
		nodeRoot.addItem(new Item(10));
		nodeRoot.addItem(new Item(15));
		nodeRoot.addItem(new Item(25));
		
		SE.showTree(nodeRoot);
		
	}

}
