package Program;

import javax.swing.*;

public class MyStartPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected JTextField rowInput = new JTextField("10", 3);
	protected JTextField colInput = new JTextField("10", 3);
	protected JTextField minesInput = new JTextField("10", 3);
	private JSlider rowSlider = new JSlider(5, 50, 10);
	private JSlider colSlider = new JSlider(5, 50, 10);
	private JSlider minesSlider = new JSlider(5, 25, 10);
	
	public MyStartPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel rLabel = new JLabel("ROW");
		JLabel cLabel = new JLabel("COLUMN");
		JLabel mLabel = new JLabel("MINES");
		
		rowSlider.setPaintTicks(true);
		rowSlider.setPaintLabels(true);
		rowSlider.setMajorTickSpacing(10);
		rowSlider.setMinorTickSpacing(5);
		rowSlider.addChangeListener(e-> {
			JSlider source = (JSlider)e.getSource();
			rowInput.setText(source.getValue()+"");
			int maxMines = Integer.valueOf(rowInput.getText()) * Integer.valueOf(colInput.getText()) / 4;
			minesSlider.setMaximum(maxMines);
			minesSlider.setMajorTickSpacing(maxMines/10);
			minesSlider.setMinorTickSpacing(maxMines/10);
		});
		colSlider.setPaintTicks(true);
		colSlider.setPaintLabels(true);
		colSlider.setMajorTickSpacing(10);
		colSlider.setMinorTickSpacing(5);
		colSlider.addChangeListener(e-> {
			JSlider source = (JSlider)e.getSource();
			colInput.setText(source.getValue()+"");
			int maxMines = Integer.valueOf(rowInput.getText()) * Integer.valueOf(colInput.getText()) / 4;
			minesSlider.setMaximum(maxMines);		
			minesSlider.setMajorTickSpacing(maxMines/10);
			minesSlider.setMinorTickSpacing(maxMines/10);
		});
		
		minesSlider.setPaintTicks(true);
//		minesSlider.setPaintLabels(true);
		minesSlider.setMajorTickSpacing(10);
		minesSlider.setMinorTickSpacing(5);
		minesSlider.addChangeListener(e-> {
			JSlider source = (JSlider)e.getSource();
			minesInput.setText(source.getValue()+"");
		});
		
		add(rLabel);
		add(rowSlider);
		add(rowInput);
		add(cLabel);
		add(colSlider);
		add(colInput);
		add(mLabel);
		add(minesSlider);
		add(minesInput);
		
		setSize(800,800);
		setOpaque(true);
		JOptionPane.showMessageDialog(null, this, "MineSweeper", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		new MyStartPanel();
	}
	
}
