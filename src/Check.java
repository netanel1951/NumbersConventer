import java.util.Scanner;

public class Check
{
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		String a = reader.next();
		a = Conventer.toDec(a, 16);
		System.out.println(a);
		System.out.println(Conventer.decTo(a,16));
	}
}
