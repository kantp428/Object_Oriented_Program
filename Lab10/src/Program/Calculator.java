package Program;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
	//Calculate Part
	private String num1="0";	
	private String num2="";	
	private String operationDisplay="";
	private String operator="";
	private String input="";
	private boolean calErr = false;
	
	//GUI Part	
	JLabel numBox;
	JLabel calBox;
	
	
	//Grid Bag Constraint Part
	public static GridBagConstraints createConstraints(int gridx, int gridy, int gridWidth, int gridHeight) {
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridWidth;
        gbc.gridheight = gridHeight;
        gbc.fill = GridBagConstraints.BOTH; 
        gbc.insets = new Insets(3, 3, 3, 3);
        gbc.weightx = 1;
        gbc.weighty = 1;
        return gbc;
	}
	
	public static GridBagConstraints createConstraints(int gridx, int gridy) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.weightx = 1;
        gbc.weighty = 1;
		return gbc;
	}
	///////////////////////////////////////////////////////
	
	public Calculator(String title) {
		super(title);
		setSize(500, 700);
		JPanel showPanel;
		JPanel allPanel;
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, times, devided, point, equal, c, ce;
		showPanel = new JPanel();
		showPanel.setBackground(Color.WHITE);
		showPanel.setLayout(new GridBagLayout());
		//showPanel.setPreferredSize(new Dimension(450, 100));
		
		allPanel = new JPanel();	
		allPanel.setPreferredSize(new Dimension(450, 400));
		allPanel.setBackground(Color.LIGHT_GRAY);
		allPanel.setLayout(new GridBagLayout());
		
		numBox = new JLabel("0");
		numBox.setFont(new Font("Arial", Font.PLAIN, 30));
		numBox.setPreferredSize(new Dimension(450, 90));
		numBox.setHorizontalAlignment(JLabel.RIGHT);
		
		calBox = new JLabel(operationDisplay);
		calBox.setFont(new Font("Arial", Font.PLAIN, 20));
		calBox.setHorizontalAlignment(JLabel.RIGHT);
	
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		point = new JButton(".");
		plus = new JButton("+");
		minus = new JButton("-");
		times = new JButton("x");
		devided = new JButton("/");
		equal = new JButton("=");
		c = new JButton("C");
		ce = new JButton("CE");
		
		JButton[] allNumBut = {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, point};
		JButton[] allOparBut = {plus, minus, times, devided};
		JButton[] allFuncBut = {equal, c, ce};
		for(JButton i : allNumBut) {
			i.setFont(new Font("Arial", Font.PLAIN, 20));
		}
		for(JButton i : allOparBut) {
			i.setFont(new Font("Arial", Font.PLAIN, 20));
		}
		
		for(JButton i : allFuncBut) {
			i.setFont(new Font("Arial", Font.PLAIN, 20));
		}
		
		showPanel.add(calBox, createConstraints(0, 0, 1, 1));	
		showPanel.add(numBox, createConstraints(0, 1, 1, 2));	
		
		allPanel.add(showPanel, createConstraints(0, 0, 4, 1));
		allPanel.add(c, createConstraints(0, 1));
		allPanel.add(ce, createConstraints(1, 1));
		allPanel.add(devided, createConstraints(2, 1));
		allPanel.add(times, createConstraints(3, 1));
		allPanel.add(b7, createConstraints(0, 2));
		allPanel.add(b8, createConstraints(1, 2));
		allPanel.add(b9, createConstraints(2, 2));
		allPanel.add(plus, createConstraints(3, 2));
		allPanel.add(b4, createConstraints(0, 3));
		allPanel.add(b5, createConstraints(1, 3));
		allPanel.add(b6, createConstraints(2, 3));
		allPanel.add(minus, createConstraints(3, 3));
		allPanel.add(b1, createConstraints(0, 4));
		allPanel.add(b2, createConstraints(1, 4));
		allPanel.add(b3, createConstraints(2, 4));
		allPanel.add(equal, createConstraints(3, 4, 1, 2));
		allPanel.add(b0, createConstraints(0, 5, 2, 1));
		allPanel.add(point, createConstraints(2, 5));
		
		
		for(JButton i : allNumBut) {
			i.addActionListener(new numAction(i.getText()));
		}
		
		for(JButton i : allOparBut) {
			i.addActionListener(new opAction(i.getText()));
		}
		
		equal.addActionListener(new equal());
		c.addActionListener(new allClear());
		ce.addActionListener(new clearInput());
		
		//add(showPanel, BorderLayout.NORTH);
		add(allPanel, BorderLayout.CENTER);
	}
	
	
	private class numAction implements ActionListener {
		private String number;
		public numAction(String num) {
			number = num;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(calErr==false) {
				if(!number.equals(".") || input.indexOf('.')==-1) {
					if(input.equals("0") && !number.equals(".")) {
						input = number;				
					}else {
						input = input + number;
					}
					numBox.setText(input);
				}			
			}
		}
	}
	
	private class opAction implements ActionListener {
		private String op;
		public opAction(String op) {
				this.op = op;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(calErr==false) {
					if(!input.isEmpty() && operator.isEmpty()) {
						num1 = input;
					}else if(input.isEmpty() && operator.isEmpty()) {
						num1 = "0";
					}else if(input.isEmpty() && !operator.isEmpty()) {
						
					}else {
						num2 = input;
						double n1 = Double.valueOf(num1);
						double n2 = Double.valueOf(num2);
						double output = operation(n1, n2, operator);
						
						if(!(operator.equals("/") && n2==0)) {
							calBox.setText(output+" "+op);
							numBox.setText(output+"");
							num1 = output+"";
							num2 = "";
							input = "";
							operator = "";
						}else {
							calBox.setText("Press C button to continue");
						}
					}
					operator = op;
					input = "";
					operationDisplay = (num1+" "+operator+" ");
					if(calErr == false) {
						numBox.setText(operator);
						calBox.setText(operationDisplay);				
					}
				
			}
		}
	}
	
	private class equal implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {	
			if(calErr==false && !input.isEmpty() && !operator.isEmpty()) {
				num2 = input;
				input = "";
				double n1 = Double.valueOf(num1);
				double n2 = Double.valueOf(num2);
				double output = operation(n1, n2, operator);
				
				if(!(operator.equals("/") && n2==0)) {
					calBox.setText(calBox.getText() + num2 + " =");
					numBox.setText(output+"");
					num1 = output+"";
					//num2 = "";
					input = "";
					//operator = "";
				}else {
					calBox.setText("Press C button to continue");
				}
			}else if(calErr==false && input.isEmpty()) {
				if(!operator.isEmpty()) {
					double n1 = Double.valueOf(num1);
					double n2 = Double.valueOf(num2);
					double output = operation(n1, n2, operator);
					
					if(!(operator.equals("/") && n2==0)) {
						calBox.setText(num1 +" "+ operator +" "+ num2 + " =");
						numBox.setText(output+"");
						num1 = output+"";
						input = "";
					}else {
						calBox.setText("Press C button to continue");
					}
				}
			}
		
		}
	}
	
	private class allClear implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			num1="0";
			num2="";
			operationDisplay="";
			operator="";
			input="";
			calBox.setText(operationDisplay);
			numBox.setText("0");
			calErr = false;
		}		
	}

	private class clearInput implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(calErr==false) {
				if(input.isEmpty()) {
					num1="0";
					numBox.setText("0");
				}else {
					input="0";
					numBox.setText("0");						
				}
			}
		}
	}
	
	private double operation(double n1, double n2, String operation) {
		double output = 0;
		
		if(operator=="+") {
			output = n1 + n2;
		}else if(operator=="-") {
			output = n1 - n2;
		}else if(operator=="x") {
			output = n1 * n2;
		}else if(operator=="/") {
			if(n2 == 0) {
				numBox.setText("Cannot divide by zero");
				calErr = true;
			}else {
				output = n1 / n2;			
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator("cal1");
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
}
