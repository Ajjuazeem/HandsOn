package JavaImportantInterviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringLogic {
	public static void main(String[] args) {
		ReverseStringLogic call = new ReverseStringLogic();
		call.UsingStringBuffer();
	}

	public void ownlogic() {

		String was = "Lest do this";
		char[] arr = was.toCharArray();

		String is = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			is = is + arr[i];
		}
		System.out.println(is);

	}

	public void usingcollection() {

		String name = "google";
		char[] given = name.toCharArray();
		String store = " ";

		List<Character> list = new ArrayList<Character>();
		for (Character character : list) {
			list.add(character);

		}
		Collections.reverse(list);

		ListIterator li = list.listIterator();
		while (li.hasNext()) {
			Object object = (Object) li.next();
			
		}
		

	}

	public void UsingStringBuffer() {
		
		String give = "Azeem";

		StringBuffer gi = new StringBuffer();
		gi.append(give);
		StringBuffer pr = gi.reverse();
		System.out.println(pr);

	}

}
