import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.Ignore;

/**
 * 
 */

/**
 * @author A0108165J
 * 
 */
public class TestHeapType {

  public TestHeapType() {

  }

  public static int INDETERMINATE = 0;
  public static int MIN_HEAP = 1;
  public static int MAX_HEAP = 2;

  /**
   * This function takes a Priority Queue, and determines if it is a mean heap
   * or a max heap.
   * 
   * The comparator has to specified, as the original Priority Queue
   * Constructor's comparator cannot be used (it is not known whether the heap
   * is max / min because the comparator is modified.
   * 
   * Precondition: Priority Queue is well-ordered. therefore, only the first 2
   * elements need to be examined, for efficiency.
   * 
   * @param pq
   * @param firstElemBiggerComparator
   *          the comparator, where first elem is bigger, to use.
   * @return
   */
  @SuppressWarnings("unchecked")
  public static <E> int isMinHeap(PriorityQueue<E> pq,
      Comparator<E> firstElemBiggerComparator) {
    if (pq.size() <= 1) {
      return INDETERMINATE;
    }

    E a = pq.poll(), b = pq.peek(); // for minimal deletion time
    pq.offer(a); // insert back to queue

    Comparator<E> comparator = (Comparator<E>) pq.comparator();

    // Comparator available
    if (comparator != null) {
      if (firstElemBiggerComparator.compare(a, b) > 0) {
        return MAX_HEAP;
      }
      // Comparator not available
    } else {
      if (((Comparable<E>) a).compareTo(b) > 0) {
        return MAX_HEAP;

      }
    }

    // return the exclusion otherwise
    return MIN_HEAP;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {

  }

}
