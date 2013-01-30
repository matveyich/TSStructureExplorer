
public class SE {

	private static int level = 0; 
	//private static String delim = "--";
	private static String nodeDelim = nodeDelim.repeat("--", level);
	
	public static void showTree(Node nodeRoot){
		SE.level++;
		SE.showItems(nodeRoot);
		for (Node node : nodeRoot.getChildren()) {	
			SE.showItems(node);
			SE.showTree(node);
		}
	}
	
	public static void showItems(Node node){
		if (node.getItems().isEmpty() == true) {
			System.out.println("|" +  + " !no items inside this node");
		} else {
			for (Item item : node.getItems()) {
				System.out.println("|--! " + item.getValue());
			}
		}
	}
	
}
