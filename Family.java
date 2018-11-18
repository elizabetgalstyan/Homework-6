
public class Family {

	public static void main(String[] args) {

		Girl g1 = new Girl(19, 1.78, 90);
		Girl g2 = new Girl(39, 1.23, 91);
		g1.getAge();
		g2.getWidth();

		Boy b1 = new Boy(14, 2.78, 70);
		Boy b2 = new Boy(29, 3.23, 60);
		b1.getAge();
		b2.getWidth();

		Baby bb1 = new Baby(12, 1.1, 20);
		Baby bb2 = new Baby(9, 1.2, 10);
		bb1.getAge();
		bb2.getWidth();

	}

	public int factorial(int n) {
		if (n <= 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
