package roman;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestFromRomanIter {
  private RomanConverter app;

  private final String input;
  private final int expected;

  public TestFromRomanIter(String input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] arr = new Object[3999][2];
    try {
        Scanner scanner = new Scanner(new File("rsc/expected.txt"));
        int i = 1;
        while (scanner.hasNextLine()) {
          Object[] sub_arr = {scanner.nextLine(), i};
          arr[i - 1] = sub_arr;
          i++;
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
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
  public void testFromRomanFile() {
    int output = app.fromRoman(input);
    System.out.println(String.format("output: %d", output));
    assert (output == expected);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFromRomanFileLower() {
    int output = app.fromRoman(input.toLowerCase());
    System.out.println(String.format("output: %d", output));
    assert (output == expected);
  }
}
