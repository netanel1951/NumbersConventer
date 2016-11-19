
public class Conventer
{
	public static String decTo(String dec, int base) {
		try{
			int temp = Integer.parseInt(dec);
			if(temp == 0) {
				return "0";
			}
			char[] numbers = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			String result = "";
			while(temp != 0){
				result = numbers[temp%base] + result;
				temp /= base;
			}
			return result;
		}
		catch(NumberFormatException e) {
			return "error";
		}

	}
	public static String toDec(String num, int base) {
		char[] numbers = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int result = 0;
		int multi = 1;
		boolean legal = false;
		for(int i = num.length()-1; i>=0; i--) {
			legal = false;
			for (int t = 0; t<base; t++) {
				if (numbers[t] == (num.charAt(i))) {
					result += t*multi;
					multi*=base;
					legal = true;
					break;
				}
			}
			if (!legal) {
				return "error";
			}
		}
		return Integer.toString(result);
	}
}
