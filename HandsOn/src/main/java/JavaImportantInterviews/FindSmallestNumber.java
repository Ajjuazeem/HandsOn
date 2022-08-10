package JavaImportantInterviews;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumber {
	
	Integer givennumber[] = {122,326,718,532,121,581,5451,816,987,0};
	
	public static void main(String[] args) {
		FindSmallestNumber find = new FindSmallestNumber();
		find.Usingcollectionsortt();
	}
	
	public void Usinglogic() {
		
		//select Max_value to get Large number to compare with small num to find smallest
		int small = Integer.MAX_VALUE;
		
		for(int i=0;i<givennumber.length;i++) {
			
			//condition larger num is less than small if con False. store small number in variable
			if(givennumber[i]<small) {
				
				small = givennumber[i];
			}
		}
		System.out.println(small);
		
	}
	public void Usingarraysort() {
		
		Arrays.sort(givennumber);
		System.out.println(givennumber[0]);
		
		
	}
	public void Usingcollectionsortt() {
		
		List<Integer> list = Arrays.asList(givennumber);
		Collections.sort(list);
		
		int small = list.get(0);
		System.out.println(small);
	}
	
}
