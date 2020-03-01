package roman;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestToRomanIter {
  private RomanConverter app;

  private final int input;
  private final String expected;

  public TestToRomanIter(int input, String expected) {
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
          Object[] sub_arr = {i, scanner.nextLine()};
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
    System.out.println(String.format("input: %d, expected: %s", input, expected));
    app = new RomanConverter();
  }

  @Test
  public void testToRomanFile() {
    String output = app.toRoman(input);
    System.out.println(String.format("output: %s", output));
    assert (output.equals(expected));
  }

}
