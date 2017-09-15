package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (getiValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		return !isEven();

	}

	public boolean isPrime() {
		for (int i = 2; i < getiValue(); i++) {
			if (getiValue() % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}

	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}

	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}

	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}

	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}

	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}

	public boolean isEquals(int iValue) {
		if (this.iValue == iValue) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEquals(MyInteger iValue) {
		if (this.iValue == getiValue()) {
			return true;
		} else {
			return false;
		}
	}
}
