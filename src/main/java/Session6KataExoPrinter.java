
public class Session6KataExoPrinter {

	public static String printer(String sequence) {
		
//		String chaineNonValide ="";
//		for (int i = 0; i < sequence.length(); i++) {
//			if (sequence.charAt(i) > 'm') {
//				chaineNonValide += sequence.charAt(i);
//			} 
//				
//		}
//		return chaineNonValide.length()  + "/" + sequence.length();
		return sequence.replaceAll("[a-m]", "").length() + "/" + sequence.length();
	}
}
