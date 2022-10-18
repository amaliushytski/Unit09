package t.lhu.unit09.main;

public class Task12 {

	public static void main(String[] args) {
		/**
		 * Получить квадратную матрицу порядка n:
		 */
		int n = 10;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = i;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
