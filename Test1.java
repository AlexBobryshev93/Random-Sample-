import java.util.Random;

class Test1 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10)); // from 0 to 9
		System.out.println(r.nextDouble(10)); // from 0 to 9
	}
}
