package roman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RomanConverterTest {

	@Test
	final void testToRoman() {
		assertEquals("IV", new RomanConverter().toRoman(4), "The result should be 4"); 
		
		
		assertThrows(IllegalArgumentException.class, () -> {
				new RomanConverter().toRoman(5000);
			  });
		
		assertThrows(IllegalArgumentException.class, () -> {
			new RomanConverter().toRoman(-1);
		  });
		
		
		try {
			new RomanConverter().toRoman(5000);
		}catch(IllegalArgumentException e) {
			assertEquals("number out of range (must be 1..3999)", e.getMessage());
		}
		
		try {
			new RomanConverter().toRoman(-1);
		}catch(IllegalArgumentException e) {
			assertEquals("number out of range (must be 1..3999)", e.getMessage());
		}
		
		/*try {
			new RomanConverter().toRoman(Integer.parseInt("h"));
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertEquals("number out of range (must be 1..3999)", e.getMessage(), "number out of range exception should be thrown because of a number smaller than allowed");
			
		}*/
		
		
	}
	

	@Test
	final void testFromRoman() {
		
		assertEquals(2, new RomanConverter().fromRoman("II"));
		
		assertThrows(IllegalArgumentException.class, () -> {
			new RomanConverter().fromRoman("A");
		  });
		
		assertThrows(IllegalArgumentException.class, () -> {
			new RomanConverter().fromRoman(" ");
		  });
		assertThrows(IllegalArgumentException.class, () -> {
			new RomanConverter().fromRoman("iv");
		  });
		
		try {
			new RomanConverter().fromRoman("A");
		}catch(IllegalArgumentException e) {
			assertEquals("Invalid Roman numeral: A", e.getMessage());
		}
		
		
	}

}
