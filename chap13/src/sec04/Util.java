package sec04;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<t>();
		box.set (t);
		return box;
	}
}
