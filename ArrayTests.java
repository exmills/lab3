import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //My own written tests
  @Test
  public void testReversedInPlace2() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  //bug: divides by 4 but only adds up 3 doubles.
  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.2, 1.2, 2.2, 8.8, 10.6};
    assertEquals(5.7, ArrayExamples.averageWithoutLowest(input1), 0.01);

  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {1.2, 1.2, 1.2, 1.2, 10.6};
    assertEquals(3.55, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}
