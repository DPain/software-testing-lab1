package roman;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestToRoman {
  private RomanConverter app;

  private final int input;
  private final String expected;

  public TestToRoman(int input, String expected) {
    this.input = input;
    this.expected = expected;
  }

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] arr = new Object[Value.values().length][2];
    for(int i = 0; i < Value.values().length; i++) {
      Value symbol = Value.values()[i];
      Object[] sub_arr = {symbol.value(), symbol.name()};
      arr[i] = sub_arr;
    }
    
    return Arrays.asList(arr);
  }

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    System.out.println(String.format("input: %d, expected: %s", input, expected));
    app = new RomanConverter();
  }

  @Test
  public void testToRoman() {
    String output = app.toRoman(input);
    System.out.println(String.format("output: %s", output));
    assert (output.equals(expected));
  }

}
