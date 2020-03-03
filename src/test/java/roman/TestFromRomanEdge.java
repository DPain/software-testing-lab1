package roman;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestFromRomanEdge {

  private RomanConverter app;
  
  private final String input;

  public TestFromRomanEdge(String input) {
    this.input = input;
  }

  @Parameters
  public static Collection<Object[]> data() {    
    return Arrays.asList(new Object[][] {{"A"}, {" "}, {"iv"}});
  }

  @Before
  public void init() {
    System.out.println("----- Test Start! -----");
    app = new RomanConverter();
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testToRomanEdge() {
    System.out.println(String.format("input: %s, expected: %s", input, "IllegalArgumentException"));
    app.fromRoman(input);
  }
  
}
