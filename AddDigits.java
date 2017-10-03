
public class AddDigits {

	public static int addDigits(int num) {
		int sum = num % 10;
		num /= 10;
		while(num / 10 > 0){
			sum += num % 10;
			num /= 10;
			if(sum / 10 > 0){
				sum = makeSingleDigit(sum);
			}
		}
		int result = sum + num;
		if(result / 10 > 0){
			result = makeSingleDigit(result);
		}
		return result;
	}

	private static int makeSingleDigit(int result) {
		int x = result % 10;
		result /= 10;
		result = x + result;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
	
		int result = addDigits(87354);
		System.out.println(result);
	}
}
