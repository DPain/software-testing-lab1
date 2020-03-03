package roman;

import org.junit.Before;
import org.junit.Test;


public class TestToRomanEdge {
  private RomanConverter app;

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    app = new RomanConverter();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToRomanLarge() {
    System.out.println(String.format("input: %d, expected: %s", 4000, "IllegalArgumentException"));
    app.toRoman(4000);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testToRomanSmall() {
    System.out.println(String.format("input: %d, expected: %s", -1, "IllegalArgumentException"));
    app.toRoman(-1);
  }

}
