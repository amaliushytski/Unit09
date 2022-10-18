package t.lhu.unit09.main;

public class Task13 {

	public static void main(String[] args) {
		/**
		 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		 */

		int n = 10;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
					System.out.printf("%3d ", mas[i][j]);
				}
				System.out.println();
			} else {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					mas[i][j] = j + 1;
					System.out.printf("%3d ", mas[i][j]);
				}
				System.out.println();
			}

		}
	}
}
