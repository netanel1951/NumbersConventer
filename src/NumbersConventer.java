import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class NumbersConventer extends JPanel implements ActionListener
{
	JFrame frm;
	JButton cnvrt;
	JButton clear;
	JTextField num;
	JTextField result;
	JComboBox chs1;
	JComboBox chs2;
	JLabel num1;
	JLabel result1;
	int numBase = 0, resultBase = 0;
	boolean possible1 = false, possible2 = false;
	String[] options = {" ","binary (base 2)", "Ternary (base 3)", "Quaternary (base 4)", "Quinary (base 5)", "Senary (base 6)", "Septenary (base 7)", "Octonary (base 8)", "Nonary (base 9)", "Decimal (base 10)", "Undenary (base 11)", "Duodecimal (base 12)", "Tridecimal (base 13)", "Quattuordecimal (base 14)", "Quindecimal (base 15)", "Hexadecimal (base 16)"};
	public NumbersConventer(){
		frm = new JFrame ("Conventer");
		frm.add(this);
		frm.setSize(700, 250);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		setLayout(null);
		frm.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/2-frm.getWidth()/2,Toolkit.getDefaultToolkit().getScreenSize().height/2-frm.getHeight()/2);
		cnvrt = new JButton("Convert");
		num = new JTextField();
		result = new JTextField();
		chs1 = new JComboBox(options);
		chs2 = new JComboBox(options);
		num1 = new JLabel("Number:");
		result1 = new JLabel("Result:");
		clear = new JButton("Clear");
		add(num1);
		add(result1);
		add(cnvrt);
		add(num);
		add(result);
		add(chs1);
		add(chs2);
		add(clear);
		num.setBounds(50, 50, 200, 50);
		num.setFont(new Font("Elephant", Font.PLAIN, 20));
		result.setBounds(450, 50, 200, 50);
		result.setFont(new Font("Elephant", Font.PLAIN, 20));
		result.setEditable(false);
		Border b = BorderFactory.createLineBorder(Color.black, 2);
		num.setBorder(b);
		result.setBorder(b);
		num1.setBounds(50,10,200,50);
		result1.setBounds(450,10,200,50);
		num1.setFont(new Font("Elephant", Font.PLAIN, 20));
		result1.setFont(new Font("Elephant", Font.PLAIN, 20));
		cnvrt.setBounds(260, 50, 180, 50);
		cnvrt.setFont(new Font("Elephant", Font.PLAIN, 30));
		chs1.setSelectedIndex(0);
		chs2.setSelectedIndex(0);
		chs1.setBounds(50,125,200,50);
		chs1.setFont(new Font("Elephant", Font.PLAIN, 15));
		chs2.setBounds(450,125,200,50);
		chs2.setFont(new Font("Elephant", Font.PLAIN, 15));
		clear.setBounds(260, 125, 180, 50);
		clear.setFont(new Font("Elephant", Font.PLAIN, 30));
		chs2.addActionListener(this);
		chs1.addActionListener(this);
		cnvrt.addActionListener(this);
		clear.addActionListener(this);
	}
	public static void main(String[]args) {
		new NumbersConventer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src.equals(chs1)) {
			switch (String.valueOf(chs1.getSelectedItem())) {
			case " ":
				numBase = 0;
				possible1 = false;
				break;
			case "binary (base 2)": 
				numBase = 2;
				possible1 = true;
				break;
			case "Ternary (base 3)":
				numBase = 3;
				possible1 = true;
				break;
			case "Quaternary (base 4)":
				numBase = 4;
				possible1 = true;
				break;
			case "Quinary (base 5)":
				numBase = 5;
				possible1 = true;
				break;
			case "Senary (base 6)":
				numBase = 6;
				possible1 = true;
				break;
			case "Septenary (base 7)":
				numBase = 7;
				possible1 = true;
				break;
			case "Octonary (base 8)":
				numBase = 8;
				possible1 = true;
				break;
			case "Nonary (base 9)":
				numBase = 9;
				possible1 = true;
				break;
			case "Decimal (base 10)":
				numBase = 10;
				possible1 = true;
				break;
			case "Undenary (base 11)":
				numBase = 11;
				possible1 = true;
				break;
			case "Duodecimal (base 12)":
				numBase = 12;
				possible1 = true;
				break;
			case "Tridecimal (base 13)":
				numBase = 13;
				possible1 = true;
				break;
			case "Quattuordecimal (base 14)":
				numBase = 14;
				possible1 = true;
				break;
			case "Quindecimal (base 15)":
				numBase = 15;
				possible1 = true;
				break;
			case "Hexadecimal (base 16)":
				numBase = 16;
				possible1 = true;
				break;
			}
		}
		if(src.equals(chs2)) {
			switch (String.valueOf(chs2.getSelectedItem())) {
			case " ":
				resultBase = 0;
				possible2 = false;
				break;
			case "binary (base 2)": 
				resultBase = 2;
				possible2 = true;
				break;
			case "Ternary (base 3)":
				resultBase = 3;
				possible2 = true;
				break;
			case "Quaternary (base 4)":
				resultBase = 4;
				possible2 = true;
				break;
			case "Quinary (base 5)":
				resultBase = 5;
				possible2 = true;
				break;
			case "Senary (base 6)":
				resultBase = 6;
				possible2 = true;
				break;
			case "Septenary (base 7)":
				resultBase = 7;
				possible2 = true;
				break;
			case "Octonary (base 8)":
				resultBase = 8;
				possible2 = true;
				break;
			case "Nonary (base 9)":
				resultBase = 9;
				possible2 = true;
				break;
			case "Decimal (base 10)":
				resultBase = 10;
				possible2 = true;
				break;
			case "Undenary (base 11)":
				resultBase = 11;
				possible2 = true;
				break;
			case "Duodecimal (base 12)":
				resultBase = 12;
				possible2 = true;
				break;
			case "Tridecimal (base 13)":
				resultBase = 13;
				possible2 = true;
				break;
			case "Quattuordecimal (base 14)":
				resultBase = 14;
				possible2 = true;
				break;
			case "Quindecimal (base 15)":
				resultBase = 15;
				possible2 = true;
				break;
			case "Hexadecimal (base 16)":
				resultBase = 16;
				possible2 = true;
				break;
			}
		}
		if(src.equals(clear)) {
			resultBase = 0;
			numBase = 0;
		}
	}
}
