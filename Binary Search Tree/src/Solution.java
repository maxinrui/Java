
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> tree = new BinaryTree<Integer>(5);
		tree.add(2);
		tree.add(6);
		tree.add(3);
		tree.add(7);
		
		tree.inOrder();
		System.out.println();
		tree.preOrder();
		System.out.println();
		tree.postOrder();
	}

}
