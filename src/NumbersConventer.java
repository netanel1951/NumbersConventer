import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumbersConventer extends JPanel implements ActionListener
{
	JFrame frm;
	JButton cnvrt;
	JTextField num;
	JTextField result;
	JComboBox chs1;
	JComboBox chs2;
	String[] options = {"binary (base 2)", "Ternary (base 3)", "Quaternary (base 4)", "Quinary (base 5)", "Senary (base 6)", "Septenary (base 7)", "Octonary (base 8)", "Nonary (base 9)", "Decimal (base 10)", "Undenary (base 11)", "Duodecimal (base 12)", "Tridecimal (base 13)", "Quattuordecimal (base 14)", "Quindecimal (base 15)", "Hexadecimal (base 16)"};
	public NumbersConventer(){
		frm = new JFrame ("Conventer");
		frm.add(this);
		frm.setSize(1000, 600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		setLayout(null);
		frm.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/2-frm.getWidth()/2,Toolkit.getDefaultToolkit().getScreenSize().height/2-frm.getHeight()/2);
		cnvrt = new JButton("Convert");
		num = new JTextField();
		result = new JTextField();
	}
	public static void main(String[]args) {
		new NumbersConventer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
