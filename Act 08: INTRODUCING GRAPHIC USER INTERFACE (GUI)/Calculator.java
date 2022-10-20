import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel {
	
	private static final long serialVersionUID = 1L;	
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = 480;
	
	private GridBagLayout layout;
	
	private GridBagConstraints gbc; 
	
	private JButton[] numberButtons;
	private JButton[] opButtons;
	
	private JTextField field;
	
	
	private int[][] numConstraints = new int[][] {
		{0, 5, 2, 1},
		{0, 4, 1, 1},
		{1, 4, 1, 1},
		{2, 4, 1, 1},
		{0, 3, 1, 1},
		{1, 3, 1, 1},
		{2, 3, 1, 1},
		{0, 2, 1, 1},
		{1, 2, 1, 1},
		{2, 2, 1, 1},
	};


	private int[][] opConstraints = new int[][] {
		{2, 5, 1, 1},
		{3, 4, 1, 2},
		{3, 3, 1, 1},
		{3, 2, 1, 1},
		{3, 1, 1, 1},
		{2, 1, 1, 1},
		{1, 1, 1, 1},
		{0, 1, 1, 1},
	};
	
	public Calculator( ) {

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {80, 80, 80, 80}; 
		layout.rowHeights = new int[] {80, 80, 80, 80, 80, 80};
		setLayout(layout);
		
		gbc = new GridBagConstraints();
		
		numberButtons = new JButton[10];
		for(int i = 0; i<numberButtons.length; i++) {
			numberButtons[i] = new JButton("" + i);

			gbc.gridx = numConstraints[i][0];
			gbc.gridy = numConstraints[i][1];
			gbc.gridwidth = numConstraints[i][2];
			gbc.gridheight = numConstraints[i][3];
			
			gbc.fill = GridBagConstraints.BOTH;
			
			gbc.insets = new Insets(2, 2, 2, 2);
			
			add(numberButtons[i], gbc);
		}
		
		opButtons = new JButton[8];
		
		opButtons[0] = new JButton(".");
		opButtons[1] = new JButton("=");
		opButtons[2] = new JButton("+");
		opButtons[3] = new JButton("-");
		opButtons[4] = new JButton("*");
		opButtons[5] = new JButton("/");
		opButtons[6] = new JButton("+/-");
		opButtons[7] = new JButton("C");
		
		for(int i = 0; i < opButtons.length; i++) {
			gbc.gridx = opConstraints[i][0];
			gbc.gridy = opConstraints[i][1];
			gbc.gridwidth = opConstraints[i][2];
			gbc.gridheight = opConstraints[i][3];
			
			add(opButtons[i], gbc);
		}
		
		field = new JTextField();
		field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		field.setEditable(false);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		
		add(field, gbc);		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calcuator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(new Calculator(), BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
