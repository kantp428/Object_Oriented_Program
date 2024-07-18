package th.ac.ku.kps.cpe.Lab2;

import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String sentence = scan.nextLine();
		
		String[] sub_sentence = sentence.split("\\s+");
		
		for(String word : sub_sentence) {
			System.out.print(word+" ");
			if((word.toUpperCase()).compareTo("HAPPY")==0) {
				System.out.print(":) ");
			}else if((word.toUpperCase()).compareTo("SAD")==0) {
				System.out.print(":( ");
			}
		}
		scan.close();

	}

}
