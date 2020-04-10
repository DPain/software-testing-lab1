package roman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;


public class TestToRomanEdge {
  private RomanConverter app;

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    app = new RomanConverter();
  }

  @Test
  public void testToRomanLarge() {
    System.out.println(String.format("input: %d, expected: %s", 4000, "IllegalArgumentException"));
    try{
    	assertNotEquals("MMMM", app.toRoman(4000));
    }catch(IllegalArgumentException e) {
    	assertEquals("number out of range (must be 1..3999)", e.getMessage());
    }
  }
  
  @Test
  public void testToRomanSmall() {
    System.out.println(String.format("input: %d, expected: %s", -1, "IllegalArgumentException"));
    try{
    	assertNotEquals("", app.toRoman(-1));
    }catch (IllegalArgumentException e) {
    	assertEquals("number out of range (must be 1..3999)", e.getMessage());
    }
  }

}
