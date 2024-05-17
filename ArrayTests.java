import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    		int[] input1 = { 3 };
    		int[] input2 = { 1, 2, 3, 4, 5 };
    		int[] input3 = { 32, 34, 53, 5, 89, 7 };
		int[] input4 = {};

		ArrayExamples.reverseInPlace(input1);
		ArrayExamples.reverseInPlace(input2);
		ArrayExamples.reverseInPlace(input3);
		ArrayExamples.reverseInPlace(input4);

    		assertArrayEquals(new int[]{ 3 }, input1);
		assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input2);
		assertArrayEquals(new int[]{ 7, 89, 5, 53, 34, 32 }, input3);
		assertArrayEquals(new int[]{}, input4);
	}


  @Test
  public void testReversed() {
    int[] input0 = { };
    int[] input1 = { 3 };
    int[] input2 = { 1, 2, 3, 4, 5 };
    int[] input3 = { 32, 34, 53, 5, 89, 7 };

    ArrayExamples.reversed(input0);
    ArrayExamples.reversed(input1);
    ArrayExamples.reversed(input2);
    ArrayExamples.reversed(input3);

    assertArrayEquals(new int[]{}, input0);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input2);
    assertArrayEquals(new int[]{ 7, 89, 5, 53, 34, 32 }, input3);
  }
}
