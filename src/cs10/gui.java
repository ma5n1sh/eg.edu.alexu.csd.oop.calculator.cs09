package eg.edu.alexu.csd.oop.calculator.cs10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;

public class gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel label=new JLabel();
	JLabel lblNewLabel =new JLabel();
	public gui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Calculator-icon.png"));
		setTitle("Calculatror");
		Calculator a=new calc();
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, -39, 338, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 11, 266, 58);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("");
		label.setBackground(Color.GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(20, 80, 266, 31);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'1');
				label.setText("");
				
			}
		});
		btnNewButton.setBounds(20, 255, 45, 31);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(new Color(255, 99, 71));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'2');
				label.setText("");
			}
		});
		button.setBounds(85, 255, 45, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(new Color(255, 99, 71));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'3');
				label.setText("");;
			}
		});
		button_1.setBounds(152, 255, 45, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBackground(new Color(255, 99, 71));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'4');
				label.setText("");
			}
		});
		button_2.setBounds(20, 297, 45, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBackground(new Color(255, 99, 71));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'5');
				label.setText("");
			}
		});
		button_3.setBounds(85, 297, 45, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBackground(new Color(255, 99, 71));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'6');
				label.setText("");
			}
		});
		button_4.setBounds(152, 297, 45, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBackground(new Color(255, 99, 71));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'7');
				label.setText("");
			}
		});
		button_5.setBounds(20, 339, 45, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBackground(new Color(255, 99, 71));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'8');
				label.setText("");
			}
		});
		button_6.setBounds(85, 339, 45, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBackground(new Color(255, 99, 71));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'9');
				label.setText("");
			}
		});
		button_7.setBounds(152, 339, 45, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBackground(new Color(255, 99, 71));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(label.getText()!="") {lblNewLabel.setText("");}
				if(lblNewLabel.getText()=="No saved files available") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'0');
				label.setText("");
			}
		});
		button_8.setBounds(85, 381, 45, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setBackground(new Color(255, 99, 71));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(lblNewLabel.getText() +'+');
				label.setText("");
			}
		});
		button_9.setBounds(216, 255, 45, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setBackground(new Color(255, 99, 71));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(lblNewLabel.getText() +'-');
				label.setText("");
			}
		});
		button_10.setBounds(216, 301, 45, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setBackground(new Color(255, 99, 71));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(label.getText()!="") {lblNewLabel.setText("");}
				lblNewLabel.setText(lblNewLabel.getText() +'*');
				label.setText("");
			}
		});
		button_11.setBounds(216, 343, 45, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.setBackground(new Color(255, 99, 71));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(lblNewLabel.getText() +'/');
				label.setText("");
			}
		});
		button_12.setBounds(216, 381, 45, 31);
		contentPane.add(button_12);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBackground(new Color(255, 99, 71));
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String z=a.prev();
				if(z!=null) {
				lblNewLabel.setText(z);
				label.setText("");}
				else if(z==null){ 
					label.setForeground(Color.red);
					label.setText("No Prev Availble"); 
				
				}
			
			}
		});
		btnPrev.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPrev.setBounds(20, 217, 65, 31);
		contentPane.add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(255, 99, 71));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String z=a.next();
				if(z!=null) {
					
					lblNewLabel.setText(z);
					label.setText("");
					
				}
				else {
					label.setForeground(Color.red);
					label.setText("No Next Availble");
					 }
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNext.setBounds(95, 217, 66, 31);
		contentPane.add(btnNext);
		
		JButton button_15 = new JButton("=");
		button_15.setBackground(new Color(255, 99, 71));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {label.setForeground(Color.black);
				a.input(lblNewLabel.getText());
				label.setText(a.getResult());
				
			}
		});
		button_15.setBounds(271, 255, 45, 157);
		contentPane.add(button_15);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(255, 99, 71));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					a.save();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblNewLabel.setText("saved Successfuly");
				label.setText("");
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSave.setBounds(174, 217, 66, 31);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBackground(new Color(255, 99, 71));
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					a.load();
				} catch (NumberFormatException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
		
					e1.printStackTrace();
				}
				lblNewLabel.setText(a.current());
			}
		});
		btnLoad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLoad.setBounds(250, 217, 66, 31);
		contentPane.add(btnLoad);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBackground(new Color(255, 99, 71));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText().length()!=0) {
				lblNewLabel.setText(lblNewLabel.getText().substring(0, lblNewLabel.getText().length()-1));
				label.setText("");}
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCe.setBounds(20, 381, 51, 31);
		contentPane.add(btnCe);
		
		JButton button_13 = new JButton(".");
		button_13.setBackground(new Color(255, 99, 71));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(lblNewLabel.getText() +'.');
				label.setText("");
			}
		});
		button_13.setBounds(152, 381, 45, 31);
		contentPane.add(button_13);
		
		
	}
}
