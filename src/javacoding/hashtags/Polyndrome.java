package javacoding.hashtags;

public class Polyndrome {
	public static void main(String[] args) {
		int i = 123321;
		boolean poly = poly(i);
		System.out.println(poly);
	}

	public static boolean poly(int in) {
		if (in < 10)
			return true;
		while (in > 10) {
			if (isPalindrome(in)) {
				return true;
			}
			in = getSumOfDigits(in);
		}
		return false;
	}

	private static boolean isPalindrome(int n) {
		int temp = n, sum = 0, r;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		return temp == sum;
	}

	private static int getSumOfDigits(int i) {
		String iString = Integer.toString(i);
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < iString.length() - 1; j += 2) {
			int i1 = Integer.parseInt(Character.toString(iString.charAt(j)));
			int i2 = Integer.parseInt(Character.toString(iString.charAt(j + 1)));
			int sum = i1 + i2;
			sb.append(Integer.toString(sum));
		}
		return Integer.parseInt(sb.toString());
	}
}
