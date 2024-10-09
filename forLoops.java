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

	public static void main(String[] args) {
		multTable(5);

	}
}
