package th.ac.ku.kps.cpe.Lab2;

import java.util.Scanner;

public class AddTXT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		String Input = scan.nextLine();
		
		char[] num = Input.toCharArray();
		int len = num.length - 1, sum = 0;
		
		for (char i:num) {
			int data = (int)i - 48;
			System.out.printf("%d ",data);
			sum = sum + data;
			if(len!=0) {
				System.out.print("+ ");
			}
			len = len - 1;
		}
		System.out.print("= "+sum);
		scan.close();
	}
}
