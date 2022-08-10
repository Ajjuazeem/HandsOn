package JavaImportantInterviews;

public class FindOccurenceOfLetter {
	
	public static void main(String[] args) {
		FindOccurenceOfLetter f = new FindOccurenceOfLetter();
		f.occurenceofletter();
	}

	
	public void occurenceofletter() {
		
		String word = "Selenium";
		
		char find = 'e';
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			if(find==word.charAt(i))
				count++;
			
		}
		System.out.println("count of"+ " "+find+" "+"is"+" ="+" "+count);
		
	}

}
