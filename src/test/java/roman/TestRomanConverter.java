package roman;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestRomanConverter {
  private RomanConverter app;
  
  @Before
  public void init() {
    System.out.println("Test Start!");
    app = new RomanConverter();
  }

  @Test
  public void testFromRoman() {
    String input = "X";
    int output = app.fromRoman(input);
    System.out.println(output);
    assert(output == 10);
  }
  
  @Test
  public void testToRoman() {
    int input = 10;
    String output = app.toRoman(input);
    System.out.println(output);
    assert(output.equals("X"));
  }

}
