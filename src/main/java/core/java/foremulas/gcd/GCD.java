/**
 * 
 */
package core.java.foremulas.gcd;

/**
 * @author abhijeet
 *
 */
public class GCD {
	public static void main(String[] args) {
		int large = 52, small = 23;
		System.out.println(gcd(large, small));

	}

	/**
	 * @param large
	 * @param small
	 * @return
	 */
	private static int gcd(int large, int small) {

		if (large == small) {
			return small;
		}
		int num = 0;
		boolean found = false;
		while (!found || num == 1) {
			if (large % small == 0) {
				found = true;
				return small;
			} else {
				num = large % small;
				if (large % num == 0 && small % num == 0) {
					break;
				}
				large = small;
				small = num;
			}
		}
		return num;
	}
}
