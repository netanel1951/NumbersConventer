
public class Conventer
{
	public static String decTo(String dec, int base) {
		char[] numbers = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int temp = Integer.parseInt(dec);
		if(temp == 0) {
			return "0";
		}
		
		String result = "";
		while(temp != 0){
			result = numbers[temp%base] + result;
			temp /= base;
		}
		return result;
	}
}
