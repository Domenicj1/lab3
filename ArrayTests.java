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
  public void testReverseInPlace1(){
    int[] inp1 = {0,2,4,6};
    ArrayExamples.reverseInPlace(inp1);
    assertArrayEquals(new int[]{6,4,2,0}, inp1);
  }
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReverse1(){
    int[] inp1 = {1,2,3,4};
    int[] exp = {4,3,2,1};

    assertArrayEquals(exp, ArrayExamples.reversed(inp1));
  }
