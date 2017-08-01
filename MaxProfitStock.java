
public class MaxProfitStock {
	
	/*
	 * Stocks Problem!
	 */

	public static int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int max = 0;
		int sofarMin = prices[0];
		for (int i = 0; i < prices.length; ++i) {
			if (prices[i] > sofarMin) {
				max = Math.max(max, prices[i] - sofarMin);
			} else {
				sofarMin = prices[i];
			}
		}
		return max;
	}

	/*
	 * Kadane's Algorithm - Largest sum subarray, Stocks proble,
	 * 
	 */
	public static int maxProfit2(int[] prices) {
		int maxsofar = Integer.MIN_VALUE, maxEndingHere = 0;
		for (int i = 0; i < prices.length; i++) {
			maxEndingHere += prices[i];
			if (maxEndingHere < 0)
				maxEndingHere = 0;
			if (maxEndingHere > maxsofar)
				maxsofar = maxEndingHere;
		}
		return maxsofar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prices[] = {};
		maxProfit(prices);

	}

}
