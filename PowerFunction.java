package tasks.task1;

public class PowerFunction {

public static long RecursivePower(long x, int n) { // 1.1

		if (n == 0) {

			int k = 1;

			if (n > 0) {

				return RecursivePower(x, n);

			} else if (n != 0) {

				return RecursivePower(x, n);

			} else {

				return k;
			}
		}

		return -1;

	}

public static long IterativePower(long x, int n) { // 1.2

		if (n == 0)

			return 1;

		long result = x;

		long increment = x;

		for (int i = 1; i < n; i++) {

			for (int j = 1; j < x; j++) {

				result += increment;

			}

			increment = result;
		}

		return result;
	}


public static long Power_F2(long x, int n) { // 1.3

		if (n == 0)

			return 1;

		else if (n % 2 == 0)

			return (int) (n / 2);

		else if (n != 0)

			return (int) sqr((n % 2));

		else

			return IterativePower(x, n);

	}

	private static int sqr(int x) {

		return x * x;

	}

}
