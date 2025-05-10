package Examples;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Math.min(Integer.MIN_VALUE, 0.0d) ==> "+ Math.min(Integer.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Long.MIN_VALUE, 0.0d) ==> "+ Math.min(Long.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Float.MIN_VALUE, 0.0d) ==> "+ Math.min(Float.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Double.MIN_VALUE, 0.0d) ==> "+ Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println("1.0 / 0.0 ==> "+ (1.0 / 0.0));
		System.out.println("1 / 0 ==> "+ (0 / 0));
	}
}
