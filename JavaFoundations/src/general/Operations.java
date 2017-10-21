package general;

public class Operations<T> {
	T x;
	T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public Operations(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations<Integer> int1 = new Operations<Integer>(3, 2);
		Operations<String> str2 = new Operations<String>("hello", "World");

		System.out.println("Int X is "+ int1.getX());
		System.out.println("int Y is "+ int1.getY());
		System.out.println("String X is "+ str2.getX());
		System.out.println("String Y is "+ str2.getY());

	}

}
