package th.ac.ku.kps.cpe.Lab2;

import java.util.Scanner;

public class Calendar {
	
	static void PrtCalen(int[][] calen) {
		for(int i = 0 ; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(calen[i][j]==0) {
					System.out.print("   ");
				}else {
					System.out.print(calen[i][j]+"  ");
				}
				if(calen[i][j] < 10) {
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter started day: ");
		int day = scan.nextInt();
		
		int[][] calen = new int[6][7];
		int date = 1, out = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(day > 1) {
					calen[i][j] = 0;
					day--;
				}else {
					calen[i][j] = date;
					if(date==31) {
						out = 1;
						break;
					}
					date++;
				}
			}
			if(out==1) {
				break;
			}
		}
		
		PrtCalen(calen);
		
		scan.close();
	}

}
