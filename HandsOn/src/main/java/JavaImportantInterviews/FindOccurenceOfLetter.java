package JavaImportantInterviews;

public class FindOccurenceOfLetter {
	
	public static void main(String[] args) {
		
		String word = "Welcome to India";
		
		char findletter = 'o';
		int countofletter=0;
		
		for(int i=0;i<word.length();i++)
		{
			if(findletter == word.charAt(i))
				countofletter++;
		}
		System.out.println("Occourance of O is :"+" "+countofletter);
		
		
	
		

}
}
