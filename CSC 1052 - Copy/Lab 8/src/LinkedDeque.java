import java.util.ArrayList;
import java.util.List;

/**
 * Linked-List based Dequeue.
 * 
 * @author Xavier Goudeaux
 *
 */
public class LinkedDeque<T> implements DequeInterface<T>
{
	private DLLNode<T> front;
	private DLLNode<T> rear;
	private int numElements = 0;

	LinkedDeque()
	{
		front = null;
		rear = null;
	}

	/**
	 * Adds an element to the front of the queue.
	 * 
	 * @param element
	 * @throws QueueOverflowException if queue is full
	 * Note: this is a linked dequeue so your queue can never
	 * actually overflow and throw a QueueOverflowException
	 */
	@Override
	public void enqueueFront(T element) throws QueueOverflowException
	{ 
		if(isFull()) {
			throw new QueueOverflowException("Deque is full!");
		}
		DLLNode node = new DLLNode(element);
		if(isEmpty()) {
			rear = node;
		}
		else {
			front.setBack(node);
		}
		node.setForward(front);
		front = node;
		numElements++;
	}

	/**
	 * Adds element to the rear of the queue.
	 * 
	 * @param element
	 * @throws QueueOverflowException if queue is full
	 * Note: this is a linked dequeue so your queue can never
	 * actually overflow and throw a QueueOverflowException
	 */
	@Override
	public void enqueueRear(T element) throws QueueOverflowException
	{
		if(isFull()) {
			throw new QueueOverflowException("Deque is full!");
		}
		DLLNode node = new DLLNode(element);    
		  if(isEmpty()){
		   front = node;
		  }else{
		   rear.setForward(node);
		   node.setBack(rear);
		  }
		  rear = node;
		  numElements++;
		
	}

	/**
	 * Removes an element from the front of the queue.
	 * @return The element that was removed
	 */
	@Override
	public T dequeueFront() throws QueueUnderflowException
	{
		if(isEmpty()) {
			throw new QueueUnderflowException("Deque is empty!");
		}
		DLLNode first = front;
		if(front.getForward() == null) {
			rear = null;
		}
		else {
			front.setBack(front.getForward());
		}
		front = front.getForward();
		numElements--;
		return (T) first.getElement();
	}

	/**
	 * Removes an element from the rear of the queue.
	 * @return The element that was removed
	 */
	@Override
	public T dequeueRear() throws QueueUnderflowException
	{
		if(isEmpty()) {
			throw new QueueUnderflowException("Deque is empty!");
		}
		
		DLLNode last = rear;
		if(front.getForward() == null) {
			front = null;
		}
		else {
			rear.setForward(rear.getBack());
		}
		rear = rear.getBack();
		numElements--;
		return (T)last.getElement();
		
	}

	/**
	 * Reports whether or not the queue is full.
	 * Note: because this is a linked dequeue, it can never fill up.
	 * @return true if the queue is full, false otherwise
	 */
	@Override
	public boolean isFull()
	{
		
		return false;
	}

	/**
	 * Reports whether or not the queue is empty.
	 * @return true if the queue is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		
		return (size() == 0);
	}

	/**
	 * Returns a count of the number of elements in the queue.
	 * @return Number of elements in queue
	 */
	@Override
	public int size()
	{
		return numElements;
	}
	
	/**
	 * Returns a string representation of the queue elements.
	 * @return String representation of the queue
	 */
	@Override
	public String toString()
	{
		// This method is already implemented.
		// No changes are needed.
		List<T> elements = new ArrayList<T>();
		while (!isEmpty())
		{
			T element = dequeueRear();
			elements.add(element);
		}
		for (T element : elements)
		{
			enqueueFront(element);
		}
		return elements.toString();
	}
}
