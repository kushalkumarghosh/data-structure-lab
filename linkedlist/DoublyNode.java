package linkedlist;

public class DoublyNode<E> {
	private E info;
	private DoublyNode<E>prev;
	private DoublyNode<E>next;
	
public DoublyNode(DoublyNode<E>prev, E info, DoublyNode<E>next) {
	this.prev = prev;
	this.info = info;
	this.next = next;
}

public void setInfo(E info) {
	this.info = info;
}

public E getInfo() {
	return info;
}

public void setPrev(DoublyNode prev) {
	this.prev = prev;
}

public DoublyNode getPrev(DoublyNode prev) {
	return prev;
}
public void setNext(DoublyNode next) {
	this.next = next;
}

public DoublyNode getNext(DoublyNode next) {
	return next;
}

}
