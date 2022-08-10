package JavaImportantInterviews;

public class ReverseWordsinSentence {
	public static void main(String[] args) {
		
		ReverseWordsinSentence prn = new ReverseWordsinSentence();
		prn.Usinglogic();	
	}
	
	
	public void Usinglogic() {
		
		String given = "Selenium AutoMation Practice";
		
//		String reverseWord ="";
		
		String[] spl = given.split(" ");
		
		for(int i=spl.length-1;i>=0;i--) {
//			reverseWord=reverseWord+spl[i]+" ";
			System.out.print(spl[i]+" ");
		}
//		System.out.println(reverseWord+" ");
		
	}

}
