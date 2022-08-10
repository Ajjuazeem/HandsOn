package JavaImportantInterviews;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.UsingThirdVariable();
		swap.UsingwithoutThirdVariableAddition();
		swap.UsingwithoutThirdVariableMultiplication();
	}
	
	public void UsingThirdVariable() {
		
	int Mydept = 15000;
	int MybroDept = 50000;
	int tepm;
	
	tepm = Mydept;
	Mydept=MybroDept;
	MybroDept=tepm;
	System.out.println("Mine: "+ Mydept + "Brother:"+MybroDept);
	}
	
	public void UsingwithoutThirdVariableAddition() {
		int Mydept = 15000;
		int MybroDept = 50000;
		
		
		Mydept = Mydept-MybroDept;
		MybroDept = Mydept+MybroDept;
		Mydept = MybroDept-Mydept;
		System.out.println("MineA: "+ Mydept + "BrotherA:"+MybroDept);
	}
	
	public void UsingwithoutThirdVariableMultiplication() {
		int Mydept = 15000;
		int MybroDept = 50000;
		
		
		Mydept = Mydept*MybroDept;
		MybroDept = Mydept/MybroDept;
		Mydept = Mydept/MybroDept;
		System.out.println("MineM: "+ Mydept + "BrotherM:"+MybroDept);
	}
	

	

}
