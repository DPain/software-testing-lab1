package roman;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestRomanConverter {
  private RomanConverter app;
  
  @Before
  public void init() {
    System.out.println("Test Start!");
    app = new RomanConverter();
  }

  @Test
  public void testFromRoman(String input, int expected) {
    int output = app.fromRoman(input);
    System.out.println(output);
    assert(output == expected);
  }
  
  @Test
  public void testToRoman(int input, String expected) {
    String output = app.toRoman(input);
    System.out.println(output);
    assert(output.equals(expected));
  }

}
