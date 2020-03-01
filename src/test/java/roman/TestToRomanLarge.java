package roman;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class TestToRomanLarge {
  private RomanConverter app;

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    app = new RomanConverter();
  }

  @Test
  public void testToRoman() {
    System.out.println(String.format("input: %d, expected: %s", 4000, "IV"));
    String output = app.toRoman(4000);
    System.out.println(String.format("output: %s", output));
    assert (output.equals("IV"));
  }

}
