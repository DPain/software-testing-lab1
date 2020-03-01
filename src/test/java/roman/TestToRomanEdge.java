package roman;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


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
    String output = app.toRoman(4000);
    System.out.println(String.format("output: %s", output));
    assert (output.equals("IV"));
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testToRomanSmall() {
    System.out.println(String.format("input: %d, expected: %s", -1, "IllegalArgumentException"));
    String output = app.toRoman(-1);
    System.out.println(String.format("output: %s", output));
    assert (output.equals("0"));
  }

}
