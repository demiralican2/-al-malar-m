package virüs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JLabel;

public class hspmk extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hspmk frame = new hspmk();
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
	int hesap;
	double sayi,islem;
	public hspmk() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 39, 7, 20);
		contentPane.add(textPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 43, 5, 16);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setEditable(false);
		textField.setBounds(20, 39, 186, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		button.setBounds(23, 84, 41, 41);
		contentPane.add(button);
		
		Button button_1 = new Button("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_1.setBounds(70, 84, 41, 41);
		contentPane.add(button_1);
		
		Button button_2 = new Button("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"3");
			}
		
		});
		button_2.setBounds(117, 84, 41, 41);
		contentPane.add(button_2);
		
		Button button_3 = new Button("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_3.setBounds(117, 131, 41, 41);
		contentPane.add(button_3);
		
		Button button_4 = new Button("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_4.setBounds(70, 131, 41, 41);
		contentPane.add(button_4);
		
		Button button_5 = new Button("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_5.setBounds(23, 131, 41, 41);
		contentPane.add(button_5);
		
		Button button_6 = new Button("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{textField.setText(textField.getText()+"7");
			}
		});
		button_6.setBounds(23, 178, 41, 41);
		contentPane.add(button_6);
		
		Button button_7 = new Button("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"8");
			}
		});
		button_7.setBounds(70, 178, 41, 41);
		contentPane.add(button_7);
		
		Button button_8 = new Button("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_8.setBounds(117, 179, 41, 41);
		contentPane.add(button_8);
		
		JLabel yazi = new JLabel("");
		yazi.setFont(new Font("Tahoma", Font.PLAIN, 19));
		yazi.setHorizontalAlignment(SwingConstants.RIGHT);
		yazi.setBounds(10, 0, 196, 28);
		contentPane.add(yazi);
		Button button_9 = new Button("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi = Double.parseDouble(textField.getText());
				hesap = 1;
				textField.setText("");
			    yazi.setText(sayi + "+");
				
				
			}
		});
		button_9.setBounds(164, 84, 41, 41);
		contentPane.add(button_9);
		
		Button button_10 = new Button("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi = Double.parseDouble(textField.getText());
				hesap = 2;
				textField.setText("");
			    yazi.setText(sayi + "-");
			}
		});
		button_10.setBounds(164, 128, 41, 41);
		contentPane.add(button_10);
		
		Button button_11 = new Button("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi = Double.parseDouble(textField.getText());
				hesap = 4;
				textField.setText("");
			    yazi.setText(sayi + "/");
			}
		});
		button_11.setBounds(164, 178, 41, 41);
		contentPane.add(button_11);
		
		Button button_12 = new Button("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi = Double.parseDouble(textField.getText());
				hesap = 3;
				textField.setText("");
			    yazi.setText(sayi + "*");
			}
		});
		button_12.setBounds(164, 225, 41, 41);
		contentPane.add(button_12);
		
		Button button_13 = new Button("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_13.setBounds(70, 225, 41, 41);
		contentPane.add(button_13);
		
		Button button_14 = new Button(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+".");
			}
		});
		button_14.setBounds(23, 225, 41, 41);
		contentPane.add(button_14);
		
		Button button_15 = new Button("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hesaplama();
				yazi.setText("");
			}
		});
		button_15.setBounds(117, 225, 41, 88);
		contentPane.add(button_15);
		
		Button button_16 = new Button("S\u0130L");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		button_16.setBounds(26, 272, 85, 41);
		contentPane.add(button_16);
		
		
	}
	public void hesaplama(){
		switch(hesap) 
		{
		case 1:
			islem = sayi+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(islem));
			break;
		case 2:	
			islem = sayi-Double.parseDouble(textField.getText());
			textField.setText(Double.toString(islem));
			break;
		case 3:
			islem = sayi*Double.parseDouble(textField.getText());
			textField.setText(Double.toString(islem));
			break;
		case 4: 
			islem = sayi/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(islem));
			break;
		case 5: 
			islem = sayi+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(islem));
			break;
		
		}
	}
}
