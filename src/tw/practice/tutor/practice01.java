package tw.practice.tutor;

public class practice01 {

	public static void main(String[] args) {
		int row = 3; // 列數(圈數)
		int col = 3; // 行數
		int st = 1; // 從幾開始

		for (int k = 0; k < row; k++) {

			for (int j = 1; j <= 9; j++) {

				for (int i = st; i < st + col; i++) {

					int newi = i + col * k;
					int r = newi * j;

					System.out.printf(" %d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("---");
		}
	}
}