package JavaImportantInterviews;

import java.util.Scanner;

public class FindMypositionAndASCII {
	public static void main(String[] args) {
		FindMypositionAndASCII p = new FindMypositionAndASCII();
		p.FindmypositionWOScan();
	}
	
	
	public void Findmyposition() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter");
		char given = scanner.next().charAt(0);
		given = Character.toLowerCase(given);
		
		int ascii = (int)given;
		
		int position = ascii-96;
		System.out.println(position);
	}
	
public void FindmypositionWOScan() {
		
		char given ='H';
		
		given = Character.toLowerCase(given);
		
		int ascii = (int)given;
		
		int position = ascii-96;
		System.out.println(position);
	}

}
