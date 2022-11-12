package JavaImportantInterviews;

public class FindCharacterLength {

	public static void main(String[] args) {
		
		//In two ways we can achieve this using LOOP and length Function
		
		String word = "Welcome to India";
		
		char[] findlength = word.toCharArray();
		
		int charcount=0;
		
		//1st forloop
		
//		for(int i=0;i<findlength.length;i++)
//		{
//			charcount++;
//		}System.out.println(charcount);
		
		//length function
		
		System.out.println(findlength.length);
		
}
}

