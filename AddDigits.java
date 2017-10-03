
public class AddDigits {
	  /* 
    Add last two digits and check if the sum has more than 1 digit.
    If yes, add the digits too using makeSingleDigit() and add it to
    the total sum. Repeat this until you end up with one digit.
    */
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
		//Output: 9
		System.out.println(result);
	}
}
