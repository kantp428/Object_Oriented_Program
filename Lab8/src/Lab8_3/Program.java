package Lab8_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Program{
	static int i=0;
	public static void main(String[] args){
		 JFrame frame = new JFrame("Test");
		 JLabel label = new JLabel(i+""); 
		 frame.setSize(250,300);
		 frame.setVisible(true);
		 frame.setEnabled (true);
		 JButton jb = new JButton("Click");
		 JPanel center = new JPanel();			
		 center.add(jb);
		 center.add(label);
		 frame.getContentPane().add(center, BorderLayout.CENTER);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 jb.addActionListener(e -> 
//			 { 
//				 Program.i++;
//				 label.setText(i+"");
//			 }
//		 );
		 
		 jb.addActionListener( new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					Program.i++;
					label.setText(i+""); 
					jb.setText("count "+i); 
					
				}
		 	}
		 );
	}

}
