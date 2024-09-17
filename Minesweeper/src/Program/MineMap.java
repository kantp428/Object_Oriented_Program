package Program;

import static Program.MineSweeperConstants.ROW;

import java.util.Random;

import static Program.MineSweeperConstants.COLUMN; 

public class MineMap {
	protected int numMines;
	protected boolean[][] isMined;
	
	public MineMap() {
		this.isMined = new boolean[ROW][COLUMN];
	}
	
	public void newMineMap(int numMines) {
		Random rand = new Random();
		int i = 0;
		while(i<numMines) {
			int rM = rand.nextInt(ROW);
			int cM = rand.nextInt(COLUMN);
			
			if(!isMined[rM][cM]) {
				isMined[rM][cM] = true;
			}else {
				continue;
			}	
			i++;
		}
				
	}
}
