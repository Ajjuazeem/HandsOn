package JavaImportantInterviews;

public class LoopNestedLoopTringlePrint {
	public static void main(String[] args) {
		LoopNestedLoopTringlePrint check = new LoopNestedLoopTringlePrint();
		check.Squreprint();
	}

	public void Squreprint() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public void Triangleprint() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
