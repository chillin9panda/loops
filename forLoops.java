class forLoops {
	public static void nums() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void sumOfN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
	}

	public static void multTable(int n) {
		int answ;
		for (int i = 0; i <= 10; i++) {
			answ = n * i;
			System.out.println(n + " * " + i + " = " + answ);
		}
	}

	public static void evenNumbs() {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void factorial(int num) {
		int total = 1;

		for (int i = num; i >= 1; i--) {
			total *= i;
		}
		System.out.println(total);
	}

	public static void largestNum() {
		int[] nums = { 5, 12, 1, 22, 15, 6 };
		int smallest = 999999;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		largestNum();

	}
}
