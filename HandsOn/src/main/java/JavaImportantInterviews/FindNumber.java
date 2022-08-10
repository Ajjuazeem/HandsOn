package JavaImportantInterviews;

import java.util.stream.IntStream;

public class FindNumber {

	int[] array = { 1, 8, 4, 5, 6, 2, 45, 2, 3 };

	int searchnumber = 0;

	boolean found = false;

	public static void main(String[] args) {
		FindNumber num = new FindNumber();
		num.Usinglogic();
	}

	public void Usinglogic() {

		for (int i : array) {

			if (i == searchnumber) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Number Present");
		} else
			System.out.println("Number Not Present");
	}
	public void UsingInputStream() {
		
//		boolean found = IntStream.of(array).anyMatch(element->element==searchnumber);
		
//		if(found) {
//			System.out.println("Present");
//		}else
//			System.out.println("Not Present");
//	}

}
}
