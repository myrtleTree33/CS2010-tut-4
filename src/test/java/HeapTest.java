import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author A0108165J
 * 
 */
public class HeapTest {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for {@link TestHeapType#isMinHeap()}.
   */
  @Test
  public void testIsMinHeap() {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.addAll(Arrays.asList(1, 2, 3, 4, 6));
    System.out.println(pq);

    int result = TestHeapType.isMinHeap(pq, new Comparator<Integer>() {

      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }

    });
    assertEquals(TestHeapType.MIN_HEAP, result);
  }

  @Test
  public void testIsMaxHeap() {
    System.out.println("running test 2----");
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(50,
        Collections.reverseOrder());
    pq.addAll(Arrays.asList(1, 2, 3, 4, 6));
    System.out.println(pq);

    int result = TestHeapType.isMinHeap(pq, new Comparator<Integer>() {

      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }

    });
    assertEquals(TestHeapType.MAX_HEAP, result);
  }

}
