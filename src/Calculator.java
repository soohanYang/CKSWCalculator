
public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(1,2);
		System.out.println(result);
		result = calculator.substract(2,3);
		System.out.println(result);
		result = calculator.multly(2,3);
		System.out.println(result);
		result = calculator.divide(6,2);
		System.out.println(result);
	}

	private int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

	private int multly(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	private int substract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	private int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
