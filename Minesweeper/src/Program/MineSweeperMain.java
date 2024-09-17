package Program;

//import java.util.Scanner;

import javax.swing.*;

public class MineSweeperMain extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MineSweeperMain() {
		super("MineSweeper");
//		String str = JOptionPane.showInputDialog(this,"Input Row Column Bomb","****MineSweeper****",JOptionPane.PLAIN_MESSAGE);
//		String[] inputArr = str.split(" ");
//		System.out.println(Integer.valueOf(inputArr[0])+" "+Integer.valueOf(inputArr[1])+" "+Integer.valueOf(inputArr[2]));
//		MineSweeperConstants.setConstants(Integer.valueOf(inputArr[0]), Integer.valueOf(inputArr[1]));
		MyStartPanel startP = new MyStartPanel();
		MineSweeperConstants.setConstants(
				Integer.valueOf(startP.rowInput.getText()),
				Integer.valueOf(startP.colInput.getText())			
				);
		
		GameBoardPanel board = new GameBoardPanel(Integer.valueOf(startP.minesInput.getText()));
		add(board);
		board.newgame();
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		//System.out.println("555");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input row and column: ");
//		String input = sc.nextLine();
//		int row = Integer.valueOf(input.split(" ")[0]);
//		int column = Integer.valueOf(input.split(" ")[1]);
		MineSweeperMain Ms = new MineSweeperMain();
//		sc.close(); 
		Ms.setLocationRelativeTo(null);
		Ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ms.setVisible(true);
	}
}
