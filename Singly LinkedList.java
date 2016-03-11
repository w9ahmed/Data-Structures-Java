package datastructure.singlelist;

public class IntSLLNode {

	public int info;
	public IntSLLNode next;
	
	// constructor
	public IntSLLNode(int i) {
		this(i, null);
	}
	
	// constructor_1
	public IntSLLNode(int i, IntSLLNode n) {
		info = i;
		next = n;
	}
	
} // end class IntSLLNode
