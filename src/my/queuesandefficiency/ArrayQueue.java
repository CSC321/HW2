package my.queuesandefficiency;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * The existing ArrayList class already has methods for adding, removing, and 
 * looking at elements in an array. We can use inheritance to extend this class, 
 * building on existing methods to implement the required Queue methods
 * 
 * @author Kikki Beltz
 * @version September 2018
 */
public class ArrayQueue<E> extends ArrayList<E> implements Queue<E> {    
    // Retrieves and removes the head of this queue. 
    // This method differs from poll only in that it throws an exception if this
    // queue is empty.
    @Override
    public E remove() {
        return super.remove(0);
    }
    
    // Inserts the specified element into this queue if it is possible to do so 
    // immediately without violating capacity restrictions.
    @Override
    public boolean offer(E e) {
        try {
          return super.add(e);  
        } catch (IllegalStateException ex) {
          return false;  
        }
    }

    // Retrieves and removes the head of this queue, or returns null if this queue is empty.
    @Override
    public E poll() {
        if (super.size() > 0) {
            E e = super.get(0);
            super.remove(0);
            return e;
        } else {
            return null;
        }
    }
    
    // Retrieves, but does not remove, the head of this queue. This method differs
    // from peek only in that it throws an exception if this queue is empty.
    @Override
    public E element() {
        try {
            return super.get(0);
        } catch (NoSuchElementException ex) {
            return null;
        }
    }

    // Retrieves, but does not remove, the head of this queue, or returns null 
    // if this queue is empty.
    @Override
    public E peek() {
        if (super.size() > 0) {
            return super.get(0);
        } else {
            return null;
        }
    }
}
