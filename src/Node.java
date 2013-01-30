import java.util.ArrayList;


public class Node {
	private int value;
	private Node parent;
	private ArrayList<Node> children;
	private ArrayList<Item> items;
	
	public Node(int value){
		this.value = value;
		this.children = new ArrayList<Node>();
		this.items = new ArrayList<Item>();
	}
	
	public void setParentNode(Node parent){
		this.parent = parent;
	}
	
	public void addChildNode(Node child){
		this.children.add(child);
	}
	
	public int getValue(){
		return this.value;
	}
	
	public ArrayList<Node> getChildren(){
		return this.children;
	}
	
	public Node getParent(){
		return this.parent;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}
}
