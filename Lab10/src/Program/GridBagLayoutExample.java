package Program;
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
//    	String i = "1.212";
//    	String j = "1";
//    	
//    	System.out.println((Double.valueOf(i)+5)+"\n"+(Integer.valueOf(j) + 6));
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridBagLayout());

        // Add components with GridBagConstraints configured in-line
        frame.add(createButton("Button 1"), createConstraints(0, 0, 2, 1)); // Button spans 2 columns
        frame.add(createButton("Button 2"), createConstraints1(0, 1, 1, 1));
//        frame.add(createButton("Button 3"), createConstraints(1, 1, 1, 1));

        frame.setVisible(true);
    }

    // Utility method to create GridBagConstraints
    private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
//        gbc.fill = GridBagConstraints.BOTH; // Allows the component to expand in both directions
        gbc.insets = new Insets(5, 5, 5, 5); // Padding around components
        gbc.ipadx = 10;
        gbc.ipady = 10;
        return gbc;
    }
    private static GridBagConstraints createConstraints1(int gridx, int gridy, int gridwidth, int gridheight) {
    	GridBagConstraints gbc = new GridBagConstraints();
    	gbc.gridx = gridx;
    	gbc.gridy = gridy;
    	gbc.gridwidth = gridwidth;
    	gbc.gridheight = gridheight;
//    	gbc.fill = GridBagConstraints.BOTH; // Allows the component to expand in both directions
    	gbc.insets = new Insets(5, 5, 5, 5); // Padding around components
    	gbc.ipadx = 40;
    	gbc.ipady = 10;
    	return gbc;
    }

    // Utility method to create a JButton
    private static JButton createButton(String text) {
        return new JButton(text);
    }
}
