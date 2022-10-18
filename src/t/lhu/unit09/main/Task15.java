package t.lhu.unit09.main;

public class Task15 {

	public static void main(String[] args) {
		/**
		 * Сформировать квадратную матрицу порядка n по заданному образцу(n
		 */
		int n = 10;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][i] = n-j;
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();

		}
	}

}
