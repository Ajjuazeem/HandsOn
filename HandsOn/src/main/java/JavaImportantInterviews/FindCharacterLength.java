package JavaImportantInterviews;

public class FindCharacterLength {

	public static void main(String[] args) {
		FindCharacterLength ln = new FindCharacterLength();
		ln.WOusinglength();
		ln.Withusinglength();
		
	}

	public void WOusinglength() {
		
		String given = "Selenium Automation Testing";
				
				char[] chararray = given.toCharArray();
		
		int length = 0;
		
//		for (char c : chararray) {
//			length++;
//		}
		for(int i=0;i<chararray.length;i++) {
			length++;
		}
		
		System.out.println("W/O using Length Function:"+" "+length);
	}
	
public void Withusinglength() {
		
		String given = "Selenium Automation Testing";
		int print = given.length();
		System.out.println("Using Length Function:"+" "+print);
		
	}

}
