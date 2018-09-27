# HW2

## Part 1: Timing a LinkedList Queue
As we mentioned in class, the LinkedList class implements the Queue interface efficiently, providing O(1) implementations of add, remove, and peek. For the first part of this assignment, you will write a short driver program to experimentally verify these efficiencies. Your program should prompt the user for a size and construct a queue containing that many random values. It should then traverse the entire queue ten times, peeking at the front, removing the front, and adding it to the back each time. For example, if the queue contained 1,000 values, a single traversal of the list would perform the peek-remove-add sequence 1,000 times. Ten traversals of the list would result in 10,000 of each operation. Your program should time how long it takes to make these ten traversals using the provided StopWatch class. Be aware that a StopWatch measures clock time, which is affected by many factors other than code execution (e.g., background jobs, garbage collection). To minimize these factors, limit background jobs and also perform multiple timings to identify and disregard outliers.

For example, execution of your program might appear as follows (with the timing being purely fictional):

  Enter the queue size: 10000
  Time (in msec): 5.0
 

## Part 2: Rate of Growth
Since each peek, remove, and add operation on a LinkedList is O(1), and your program is doing 10*N of each operation (where N is the size of the queue), you would expect the overall program to exhibit O(N) performance. Extend your program to help verify this. In particular, prompt the user for an initial queue size, and repeatedly double that size until it reaches an upper limit (also specified by the user). Display the sizes and timings for each generated queue.

For example (also with fictional timings):

  Enter the initial queue size: 10000
  Double the size up until: 200000
  
  list size          time (in msec)
  ---------          --------------
  10000              5.0
  20000              6.8
  40000              8.2
  80000              9.3
  160000             11.0
Run your program on list sizes sufficient to demonstrate a reasonable and consistent pattern, and record the timings in a separate document. Do these experimental timings demonstrate the expected patterns for an O(N) algorithm? Justify your answer in the document.

 

## Part 3: ArrayQueue
What we would like to do next is compare the LinkedList implementation of a Queue with an ArrayList based one. We could implement our own class from scratch that has an array as a field and provides all the methods required by the Queue interface. There is a simpler way, however. The existing ArrayList class already has methods for adding, removing, and looking at elements in an array. We can use inheritance to extend this class, building on existing methods to implement the required Queue methods. For example, the definition of the remove method in the new class ArrayQueue is provided below:


  public class ArrayQueue<E> extends ArrayList<E> implements Queue<E> {
      public E remove() {
	        return super.remove(0);
      }
  
      // definitions of the other methods required by Queue
  }
Complete the definition of the ArrayQueue class so that it fully implements the Queue interface. Then modify your program so that it utilizes an ArrayQueue instead of a LinkedList. Note that this should require change to only one line of code.

Since the remove method for ArrayQueue is O(N), you would expect this version of your program to be significantly slower than the original version. Do your timings confirm this? What would you expect the Big-Oh efficiency of this modified program to be? Is that supported by your timings? Use your program to generate a table of timings and justify your answers based on those timings.