package Program;

import java.awt.Color;

import javax.swing.*;

public class Cell extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected int row;
	protected int column;
	
	protected boolean isMined;
	protected boolean isRevealed;
	protected boolean isFlaged;
	
	
	public void newGame(boolean isMined) {
		isRevealed = false;
		isFlaged = false;
		this.isMined = isMined;
		setEnabled(true);
		setText("");
		paint();
	}
	
	public void paint() {
		//super.setForeground((isRevealed)? Color.YELLOW : Color.GRAY);
		super.setBackground((isRevealed)? Color.lightGray: new JButton().getBackground());
		if(isFlaged) {
			super.setBackground(Color.PINK);	
		}else if(!isRevealed){
			super.setBackground(new JButton().getBackground());		
		}
			
	}
	
	public void setPosition(int row, int column) {
		this.row = row;
		this.column = column;
	}
}
