package JavaImportantInterviews;

public class Vowels {

	public static void main(String[] args) {
		Vowels ch = new Vowels();
//		ch.FindVowelscount();
		Anothermethod();
	}

	public void FindVowelscount() {

		String words = "selenium education practice";

		int Allcount = 0;

		for (int i = 0; i < words.length(); i++) {
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
		System.out.println("Vowels letters All" + " " + Allcount);
		if (Allcount == 0) {
			System.out.println("Fail Vowels not present");
		} else
			System.out.println("Pass Vowels present");

	}

	public static void Anothermethod() {
		
		String str = "Welcome";
		
//		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						System.out.println("Vowels present");
					}else System.out.println("Vowels Not Present");
		}
		
	}

}
