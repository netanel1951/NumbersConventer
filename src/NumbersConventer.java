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
	JTextField num;
	JTextField result;
	JComboBox chs1;
	JComboBox chs2;
	JLabel num1;
	JLabel result1;
	String[] options = {"binary (base 2)", "Ternary (base 3)", "Quaternary (base 4)", "Quinary (base 5)", "Senary (base 6)", "Septenary (base 7)", "Octonary (base 8)", "Nonary (base 9)", "Decimal (base 10)", "Undenary (base 11)", "Duodecimal (base 12)", "Tridecimal (base 13)", "Quattuordecimal (base 14)", "Quindecimal (base 15)", "Hexadecimal (base 16)"};
	public NumbersConventer(){
		frm = new JFrame ("Conventer");
		frm.add(this);
		frm.setSize(700, 420);
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
		num1 = new JLabel("number:");
		result1 = new JLabel("result:");
		add(num1);
		add(result1);
		add(cnvrt);
		add(num);
		add(result);
		add(chs1);
		add(chs2);
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
	}
	public static void main(String[]args) {
		new NumbersConventer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
