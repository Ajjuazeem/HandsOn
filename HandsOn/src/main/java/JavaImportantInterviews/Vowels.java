package JavaImportantInterviews;

public class Vowels {

	public static void main(String[] args) {
		Vowels ch = new Vowels();
		ch.FindVowelscount();
	}

	public void FindVowelscount() {
		
		String words = "selenium education practice";
		
		int Allcount =0;
		
		
		for(int i=0;i<words.length();i++) {
			char check = words.charAt(i);
			
			
			switch (check) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					Allcount++;			
			default:
				break;
				
			}
			
		}
		System.out.println("Vowels letters All"+" "+Allcount);
		
	}

}
