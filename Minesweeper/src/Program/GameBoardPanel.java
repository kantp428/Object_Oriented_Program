package Program;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static Program.MineSweeperConstants.ROW;
import static Program.MineSweeperConstants.COLUMN;

public class GameBoardPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected Cell[][] cells = new Cell[ROW][COLUMN]; 
	protected MineMap mines = new MineMap();
	
	public GameBoardPanel(int numMines) {
		setLayout(new GridLayout(ROW, COLUMN));
		this.mines.numMines = numMines;
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COLUMN; j++) {
				Cell c = new Cell();
				c.setPosition(i, j);
				c.paint();
				c.addMouseListener(new CellMouseListener());				
				
				cells[i][j] = c;
				add(cells[i][j]);
			}
		}
	}
	
	public void newgame() {
		mines.newMineMap(mines.numMines);
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COLUMN; j++) {
				cells[i][j].newGame(mines.isMined[i][j]);
			}
		}
	}
	
	public boolean hasWon() {
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COLUMN; j++) {
				if(!cells[i][j].isMined && !cells[i][j].isRevealed) return false;
			}
		}
		return true;
	}
	
	private int surroundMines(int srcRow, int srcCol) {
		int numMines = 0;
		for(int i=srcRow-1; i<=srcRow+1; i++) {
			for(int j=srcCol-1; j<=srcCol+1; j++) {
				if(i>=0 && i<ROW && j>=0 && j<COLUMN) {
					if(cells[i][j].isMined) numMines++;
				}
			}
		}
		
		return numMines;
	}
	
	private void revealCell(int srcRow, int srcCol) {
		int numMines = surroundMines(srcRow, srcCol);
		Cell cell = cells[srcRow][srcCol];
		
		if(cell.isRevealed) return;
		if(cell.isMined) {
			cell.setText("X");
			cell.setFont(new Font("Arial", Font.BOLD, 16));
			return;
		}
		cell.setText(numMines==0 ? "" : Integer.toString(numMines));
		cell.setFont(new Font("Arial", Font.BOLD, 16));
		cell.isRevealed = true;
		//cell.setEnabled(false);
		cell.paint();
		
		// loop recursive surrounding -->
		if (numMines == 0) {
			for (int i=srcRow-1; i<=srcRow+1; i++) {
				for (int j=srcCol-1; j<=srcCol+1; j++) {
					if (i >= 0 && i < ROW && j >= 0 && j < COLUMN) {
						// not me just 8 cell surround
						if(i!=srcRow || j!=srcCol)	revealCell(i, j);
					}
				}
			}
		}
	}
	
	class CellMouseListener extends MouseAdapter {
	    
	    @Override
	    public void mouseClicked(MouseEvent e) { 
	        Cell cell = (Cell) e.getSource();
	        
	        if(!cell.isRevealed) {
	        	if (!cell.isFlaged && SwingUtilities.isLeftMouseButton(e)) {
	        		System.out.println(cell.row + " " + cell.column + " Mine:" + cell.isMined);
	        		revealCell(cell.row, cell.column);
	        		cell.paint();
	        		if(cell.isMined) {
	        			cell.setBackground(Color.RED);
	        			losing();
	        			int ans = JOptionPane.showConfirmDialog(null, "You Lose Try Again?","BOOMMMMMMMMMMMMMM"
	        					,JOptionPane.YES_NO_OPTION);
	        			if(ans==0) {
	        				newgame();
	        			}else {       				
	        				System.exit(0);
	        			}
	        		}else if(hasWon()) {
	        			int ans = JOptionPane.showConfirmDialog(null, "You win!! Try Again?","<<___________________>>"
	        					,JOptionPane.YES_NO_OPTION);
	        			if(ans==0) {
	        				newgame();
	        			}else {
	        				System.exit(0);
	        			}
	        		}
	        		
	        	} else if (SwingUtilities.isRightMouseButton(e)) {
	        		cell.isFlaged = !cell.isFlaged;
	        		cell.setText(cell.isFlaged ? "F" : "");
	        		cell.setFont(new Font("Arial", Font.BOLD, 16));
	        		System.out.println(cell.row + " " + cell.column + " F:" + cell.isFlaged);
	        		cell.paint();
	        	}       	
	        }
	    }
	    
	    // add losing action
	    private void losing() {
	    	for(int i=0; i<ROW; i++) {
	    		for(int j=0; j<COLUMN; j++) {
	    			if(!(cells[i][j].isRevealed)) cells[i][j].isRevealed = true;
	    			if(cells[i][j].isMined) cells[i][j].setText("X");
	    		}
	    	}
	    }
	}
}
