package roman;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestFromRoman {
  private RomanConverter app;

  private final String input;
  private final int expected;

  public TestFromRoman(String input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] arr = new Object[Value.values().length][2];
    for(int i = 0; i < Value.values().length; i++) {
      Value symbol = Value.values()[i];
      Object[] sub_arr = {symbol.name(), symbol.value()};
      arr[i] = sub_arr;
    }
    
    return Arrays.asList(arr);
  }

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    System.out.println(String.format("input: %s, expected: %d", input, expected));
    app = new RomanConverter();
  }

  @Test
  public void testFromRoman() {
    int output = app.fromRoman(input);
    System.out.println(String.format("output: %d", output));
    assert (output == expected);
  }

}
