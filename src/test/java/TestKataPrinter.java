import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKataPrinter {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Session6KataExoPrinter.printer(s));
    }
}
		
