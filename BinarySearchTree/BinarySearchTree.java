/**
* Class for construction of a basic binary search tree data structure.
*
*/
public class BinarySearchTree {

	/**
	* Node object that is initialized with an integer key. Node pointers are accessed
	* directly. 
	*/
	class Node {
		int key;
		Node l;
		Node r;
		Node p;
		
		public Node(int val) {
			key = val;
			l = null;
			r = null;
			p = null;
		}
	}
	
	private Node root;
	
	/**
	* Constructor for the BinarySearchTree; is initialized in an empty (null) state.
	*/
	public BinarySearchTree() {
		this.root = null;
	}

	/**
	* Inserts a value into the binary search tree at the root of the tree.
	* @param key The value of the node to be inserted into the tree.
	*/
	public void insert(int key) {
		this.root = insert(root, key);
	}
	
	/**
	* Recursively inserts a value into the tree at the correct position. 
	* All right children of the inserted node will be greater than the node value,
	* all left children will be smaller in value.
	* @param root The root node of the BinarySearchTree object
	* @param key The new value to be inserted into the tree.
	* @return The new root node of the BinarySearchTree object.
	*/
	public Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.l = insert(root.l, key);
		}
		else if (key > root.key) {
			root.r = insert(root.r, key);
		}
		
		return root;
	}
	
	/*
	* Prints the results of an in-order traversal of the BST
	*/
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.l);
			System.out.println(root.key);
			inOrder(root.r);
		}
	}
	
	/**
	* Recursively searches the BST for the Node object corresponding to a key value.
	* @param key The value to be searched for.
	*/
	public Node search(int key) {
		return search(root, key);
	}
	
	Node search(Node x, int key) {
		if ((x == null) || (key == x.key)) {
			return x;
		}
		if (key < x.key) {
			return search(x.l, key);
		}
		else {
			return search(x.r, key);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Inserting values: 10, 210, 32, 141");
		bst.insert(10);
		bst.insert(210);
		bst.insert(32);
		bst.insert(141);
		
		System.out.println("In-order traversal: " );
		bst.inOrder(bst.root);
		System.out.println("");
		
		System.out.println("Searching for known existing key = 210: " );
		Node res1 = bst.search(210);
		System.out.println(res1.key);
		System.out.println("");
		
		System.out.println("Searching for non-existent key 211 yields null pointer: ");
		Node res2 = bst.search(211);
		System.out.println("Is resulting node key null? \n" + (res2 == null));
	}
}
