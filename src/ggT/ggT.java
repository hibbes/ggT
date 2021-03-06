package ggT;

public class ggT {

	public static int ggT_iter(int a, int b) {
		int h;
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		do {
			h = a % b;
			a = b;
			b = h;
		} while (b != 0);
		return a;
	}

	public static int ggT_reku(int a, int b) {

		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
			
		} else {
			return ggT_reku(b, a % b);
		}
	}

	public static void main(String[] args) {
		int a = 17;
		int b = 19;
		System.out.println("ggT von " + a + " und " + b + " ist " + ggT_reku(a, b));

	}

}
