package my.queuesandefficiency;

import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author Kikki Beltz
 */
public class ArrayQueue<E> extends ArrayList<E> implements Queue<E> {
    // Retrieves and removes the head of this queue. 
    // This method differs from poll only in that it throws an exception if this
    // queue is empty.
    public E remove() {
        return super.remove(0);
    }
    
    // Inserts the specified element into this queue if it is possible to do so 
    // immediately without violating capacity restrictions.
    @Override
    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Retrieves and removes the head of this queue, or returns null if this queue is empty.
    @Override
    public E poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Retrieves, but does not remove, the head of this queue. This method differs
    // from peek only in that it throws an exception if this queue is empty.
    @Override
    public E element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Retrieves, but does not remove, the head of this queue, or returns null 
    //if this queue is empty.
    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
