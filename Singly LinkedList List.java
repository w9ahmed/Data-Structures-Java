package datastructure.singlelist;

public class IntSLList {

	protected IntSLLNode head, tail;
	public IntSLList() {
		head = tail = null;
	} // end constructor
	
	// This part is wrong
	// needs correction
	// head can equal tail if also there is one element
	public boolean isEmpty() {
		return head == tail;
	}
	
	// Needs fixing also
	// What if head is not null?
	public void addToHead(int el) {
		head = new IntSLLNode(el, head);
		if(tail == null)
			tail = head;
	} // end method addToHead
	
	public void addToTail(int el) {
		if(!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		} else
			head = tail = new IntSLLNode(el);
	} // end method addToTail
	
	public int deleteFromHead() {
		int el = tail.info;
		if(head == tail)
			head = tail = null;
		else {
			IntSLLNode tmp;
			for (tmp = head; tmp.next != tail; tmp = tmp.next);
			tail = tmp;
			tail.next = null;
		} 
		
		return el;
	} // end method deleteFromHead
	
	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
	} // end method printAll
	
	public boolean isInList(int el) {
		IntSLLNode tmp;
		for (tmp = head; tmp != null && tmp.info != el; tmp = tmp.next);
		return tmp != null;
	} // end method isInList
	
	public void delete(int el) {
		if(!isEmpty()) {
			if (head == tail && el == head.info)
				head = tail = null;
			else if (el == head.info)
				head = head.next;
			else {
				IntSLLNode pred, tmp;
				for (pred = head, tmp = head.next; 
						tmp != null && tmp.info != el;
						pred = pred.next, tmp = tmp.next); // end for loop
				if(tmp != null) {
					pred.next = tmp.next;
					if(tmp == tail)
						tail = pred;
				}
			}
		} // end if
	} // end method delete
	
} // end class IntSLList
