public class DoublyLinkedNode<E>
{
	
protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;
/**
 * @return the data
 */
public E value() {
	return data;
}

/**
 * @return the nextElement
 */
public DoublyLinkedNode<E> next() {
	return nextElement;
}

/**
 * @param nextElement the nextElement to set
 */
public void setNext(DoublyLinkedNode<E> nextElement) {
	this.nextElement = nextElement;
}

/**
 * @return the previousElement
 */
public DoublyLinkedNode<E> previous() {
	return previousElement;
}

/**
 * @param previousElement the previousElement to set
 */
public void setPreviousElement(DoublyLinkedNode<E> previousElement) {
	this.previousElement = previousElement;
}
/**
 * @param next the nextElement to set
 * @param previos the previousElement to set
 */

public DoublyLinkedNode(E v,
                        DoublyLinkedNode<E> next,
                        DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}
/**
 * @param v random element
 */
public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}
}