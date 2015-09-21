
public class BinaryTree<T extends Comparable<T>> {
	TreeNode<T> root;
	
	public BinaryTree() {
		super();
		this.root = new TreeNode<T>();
	}

	public BinaryTree(T o) {
		super();
		// TODO Auto-generated constructor stub
		TreeNode<T> node = new TreeNode<T>(o);
		this.root = node;
	}
	
	public void add(T o) {
		if (root == null) {
			root = new TreeNode<T>(o);
		} else {
			root.insert(o);
		}
	}
	
	public boolean isMember (TreeNode<T> node, T o) {
		if(node == null) return false;
		
		if (node.element.compareTo(o) == 0) {
			return true;
		} else if (node.element.compareTo(o) < 0) {
			isMember(node.right, o);
		} else {
			isMember(node.left, o);
		}
		return false;
	}
	
	public void preOrder () {
		
	}
	
	public void inOrder() {
		
	}
	
	public void postOrder(TreeNode<T> node) {
		
	}
}
