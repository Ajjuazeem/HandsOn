package JavaImportantInterviews;

import java.util.Scanner;

public class ReverseNumbers {
	
	public static void main(String[] args) {
		
		ReverseNumbers R = new ReverseNumbers();
		R.Reverseno();
		R.ReversenoUsingScanner();
		
	}
	
	public void Reverseno() {
		
		int given = 987654321;
		int reverse = 0;
		
		while(given!=0) {
		reverse = reverse*10;
		reverse = reverse+given%10;
		given = given/10;
		
	}
		System.out.println(reverse);

}
public void ReversenoUsingScanner() {
		
		int given = 0;
		int reverse = 0;
		
		System.out.println("Please Enter");
		Scanner Scan = new Scanner(System.in);
		given = Scan.nextInt();
		
		while(given!=0) {
		reverse = reverse*10;
		reverse = reverse+given%10;
		given = given/10;
		
	}
		System.out.println(reverse);

}
}
