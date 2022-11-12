package JavaImportantInterviews;

import java.util.Scanner;

public class IfAndSwitch {
	int accountbalance = 10000;

	public static void main(String[] args) {

		IfAndSwitch check = new IfAndSwitch();
		check.ifcondition();

	}

	public void ifcondition() {

		System.out.println("Please enter the Amount");
		Scanner scan = new Scanner(System.in);
		int userenter = scan.nextInt();

		if (accountbalance >= userenter) {
			System.out.println("Payment Successful");
		} else
			System.out.println("Payment decline");
	}

	public void Switchcondition() {
		
		System.out.println("Please enter the Amount");
		Scanner scan = new Scanner(System.in);
		int userenter = scan.nextInt();

		switch (userenter) {
		case 10000:
			System.out.println("Payment successful");
			break;

		default :
			System.out.println("Payment decline");
			break;
		}

	}

}
