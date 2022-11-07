import java.util.ArrayList;
import java.util.List;

/**
*/
public class MatrixReshape {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int rows = nums.length;
		int cols = nums[0].length;

		if (rows * cols != r * c) return nums;

		int temp[][] = new int[r][c];
		List<Integer> list = new ArrayList();
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				list.add(nums[i][j]);
			}
		}
		
		int k = 0;
		for(int i = 0; i < temp.length; i++){
			for(int j = 0; j < temp[0].length; j++){
				temp[i][j] = list.get(k);
				k++;
				System.out.println("K: " + k );
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = {{1,2,3},{4,5,6},{9,8,7}};
		int temp[][] = new int[1][9];
		temp = matrixReshape(array, 1, 9);
		for(int i = 0; i < 1; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(temp[i][j] + " ");
			}
		}
	}

}
