
public class BraceChecker {

	public boolean isValid(String braces ) {
		
		String braceCase1 = "()";
		String braceCase2 = "[(])";
		Boolean result = false;
		
		if (braces == braceCase1) {
			result = true;	
		}
		
		if (braces == braceCase2) {
			result = false;
		}		
			
		return result;


	  }
	
}
