import java.util.ArrayList;
import java.util.List;

public class Session6KataExoPrinter {

	public static String Printer(String sequence) {
		int nbreOK = 0;
		int nbreKO = 0;

		// if (sequence == "a") {
		// nbreOK++; }

		List<String> reference = new ArrayList<String>();
		reference.add(sequence);
		if (sequence != null) {
		for (int i = 0; i != sequence.length(); i++) {
			if (reference[i] <= "m") {
				nbreOK++;
			} 
			else 
			{
				nbreKO++;
			}

		}
		}
		return nbreKO + "/" + nbreOK;

	}
}
