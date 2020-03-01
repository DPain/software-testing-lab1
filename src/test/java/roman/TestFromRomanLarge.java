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


public class TestFromRomanLarge {
  private RomanConverter app;

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    app = new RomanConverter();
  }

  @Test
  public void testFromRomanLarge() {
    System.out.println(String.format("input: %s, expected: %d", "IV", 4000));
    int output = app.fromRoman("IV");
    System.out.println(String.format("output: %d", output));
    assert (output == 4000);
  }

}
