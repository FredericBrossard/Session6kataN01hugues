
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKataPrinter {
	@Test
	public void PrinterNull () {
				
		assertEquals("0/0", Session6KataExoPrinter.Printer(""));
		
	}
	@Test
	public void PrinterReturn0to1 () {
		
		assertEquals("0/1", Session6KataExoPrinter.Printer("a"));
		
	}
	
	@Test
	public void PrinterReturn0to6 () {
		
		assertEquals("0/1", Session6KataExoPrinter.Printer("aabbbm"));
		
	}
}
