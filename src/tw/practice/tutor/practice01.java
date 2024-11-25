package tw.practice.tutor;

public class practice01 {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {

			for (int i = 1; i < 10; i++) {

				int r = i * j;

				System.out.printf(" %d x %d = %d\t", i, j, r);
			}
			System.out.println();

		}
	}
}