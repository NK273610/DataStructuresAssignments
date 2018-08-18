
public class ControllerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree<String> bb=new BinarySearchTree<String>();
		bb.insert("A");
		bb.insert("D");
		bb.insert("B");
		bb.insert("Z");
		bb.insert("M");
		
		bb.delete("M");
		BinaryTree.inoderTrav(bb.getTree());
		
		

	}

}
