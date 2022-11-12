package Practice;

import java.util.Scanner;

public class oddandeven {

	public static void main(String[] args) {
		number();

	}
	
	public static void number() {
		
				
				
		int a[] = {2,5,8,9,6,4,3,1,0};
		int e=0;
		int o=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				e++;
			}else {
				o++;
			}
			
		}System.out.println(e);
		
	}

}
