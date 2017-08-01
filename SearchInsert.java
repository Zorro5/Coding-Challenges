
public class SearchInsert {
	
	public static void search(int[] array){
		int x = 0, sum = 0;
		int temp = 0, max = 0;
		for(int i = 0; i < array.length; i++){
			if(x == 0 && array[i] < 0){
				x = 1;
			}
			if(x == 1 && array[i] < 0){
				x = 0;
				temp = sum;
				sum = 0;
			}
			if(temp > max) {
				max = temp;
			}
			sum = sum + array[i];
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {-5,-6,8,2,3,-9,4,8,6,5,-8,2,1,3,-9};
		search(array);
	}

}