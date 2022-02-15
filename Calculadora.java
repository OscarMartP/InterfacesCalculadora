import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Border Layout ITACA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addWindowListener(new EscuchadorVentana());
		
		JButton jb1 = new JButton("0");
		JButton jb2 = new JButton("1");
		JButton jb3 = new JButton("2");
		JButton jb4 = new JButton("3");
		JButton jb5 = new JButton("4");
		JButton jb19 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("C");
		JButton jb11 = new JButton(".");
		JButton jb12 = new JButton("+/-");
		JButton jb13 = new JButton("=>");
		JButton jb14 = new JButton("X");
		JButton jb15 = new JButton("%");
		JButton jb16 = new JButton("-");
		JButton jb17 = new JButton("+");
		JButton jb18 = new JButton("=");
		
		JTextField text = new JTextField();
		text.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		
		GridBagConstraints gb = new GridBagConstraints();
		gb.fill = GridBagConstraints.BOTH;
		gb.gridx = 0;
		gb.gridy = 0;
		gb.gridwidth = 5;

		panel.add(text, gb);
		
		//NUMERO 7
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(jb7, gbc);
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("7");
			}
		});
		
		//NUMERO 8
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.gridx = 1;
		gbc2.gridy = 1;
		panel.add(jb8, gbc2);
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("8");
			}
		});
		
		//NUMERO 9
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.fill = GridBagConstraints.HORIZONTAL;
		gbc3.gridx = 2;
		gbc3.gridy = 1;
		panel.add(jb9, gbc3);
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("9");
			}
		});
		
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.fill = GridBagConstraints.HORIZONTAL;
		gbc4.gridx = 3;
		gbc4.gridy = 1;
		panel.add(jb12, gbc4);
		
		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.fill = GridBagConstraints.HORIZONTAL;
		gbc5.gridx = 4;
		gbc5.gridy = 1;
		panel.add(jb13, gbc5);
		
		//NUMERO 4
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.fill = GridBagConstraints.HORIZONTAL;
		gbc6.gridx = 0;
		gbc6.gridy = 2;
		panel.add(jb5, gbc6);
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("4");
			}
		});
		
		//NUMERO 5
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.fill = GridBagConstraints.HORIZONTAL;
		gbc7.gridx = 1;
		gbc7.gridy = 2;
		panel.add(jb19, gbc7);
		jb19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("5");
			}
		});
		
		//NUMERO 6
		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.fill = GridBagConstraints.HORIZONTAL;
		gbc8.gridx = 2;
		gbc8.gridy = 2;
		panel.add(jb6, gbc8);
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("6");
			}
		});
		
		GridBagConstraints gbc9 = new GridBagConstraints();
		gbc9.fill = GridBagConstraints.HORIZONTAL;
		gbc9.gridx = 3;
		gbc9.gridy = 2;
		panel.add(jb14, gbc9);
		
		GridBagConstraints gbc18 = new GridBagConstraints();
		gbc18.fill = GridBagConstraints.HORIZONTAL;
		gbc18.gridx = 4;
		gbc18.gridy = 2;
		panel.add(jb15, gbc18);
		
		//NUMERO 1
		GridBagConstraints gbc10 = new GridBagConstraints();
		gbc10.fill = GridBagConstraints.HORIZONTAL;
		gbc10.gridx = 0;
		gbc10.gridy = 3;
		panel.add(jb2, gbc10);
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("1");
			}
		});
		
		//NUMERO 2
		GridBagConstraints gbc11 = new GridBagConstraints();
		gbc11.fill = GridBagConstraints.HORIZONTAL;
		gbc11.gridx = 1;
		gbc11.gridy = 3;
		panel.add(jb3, gbc11);
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("2");
			}
		});
		
		//NUMERO 3
		GridBagConstraints gbc12 = new GridBagConstraints();
		gbc12.fill = GridBagConstraints.HORIZONTAL;
		gbc12.gridx = 2;
		gbc12.gridy = 3;
		panel.add(jb4, gbc12);
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("3");
			}
		});
		
		
		GridBagConstraints gbc13 = new GridBagConstraints();
		gbc13.fill = GridBagConstraints.HORIZONTAL;
		gbc13.gridx = 3;
		gbc13.gridy = 3;
		panel.add(jb16, gbc13);
		
		GridBagConstraints gbc14 = new GridBagConstraints();
		gbc14.fill = GridBagConstraints.HORIZONTAL;
		gbc14.gridx = 0;
		gbc14.gridy = 4;
		panel.add(jb10, gbc14);
		
		
		GridBagConstraints gbc15 = new GridBagConstraints();
		gbc15.fill = GridBagConstraints.HORIZONTAL;
		gbc15.gridx = 1;
		gbc15.gridy = 4;
		panel.add(jb1, gbc15);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("0");
			}
		});
		
		GridBagConstraints gbc16 = new GridBagConstraints();
		gbc16.fill = GridBagConstraints.HORIZONTAL;
		gbc16.gridx = 2;
		gbc16.gridy = 4;
		panel.add(jb11, gbc16);
		
		GridBagConstraints gbc17 = new GridBagConstraints();
		gbc17.fill = GridBagConstraints.HORIZONTAL;
		gbc17.gridx = 3;
		gbc17.gridy = 4;
		panel.add(jb17, gbc17);
		
		GridBagConstraints gbc19 = new GridBagConstraints();
		gbc19.fill = GridBagConstraints.VERTICAL;
		gbc19.gridx = 4;
		gbc19.gridy = 3;
		gbc19.gridheight = 2;
		
		
		panel.add(jb18, gbc19);
		
		
		
		
		
		
		
		
	
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
}
}