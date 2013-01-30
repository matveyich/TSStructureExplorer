
public class SE {

	private static int level = 0; 
	private static String delim = "--";
	private static String nodeDelim = repeat(delim, level);
	
	public static String repeat(String str, int times){
		String res = "";
		res = str;	
			for (int i = 0; i < times; i++) {
				res = res + res;
			}
		return res;
	}
	
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
			System.out.println("|" + SE.nodeDelim  + " !no items inside this node");
		} else {
			for (Item item : node.getItems()) {
				System.out.println("|" + SE.nodeDelim + "! " + item.getValue());
			}
		}
	}
	
}
