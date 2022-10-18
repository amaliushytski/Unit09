package t.lhu.unit09.main;

public class Task01 {

	public static void main(String[] args) {
		/**
		 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
		 * была ровно одна единица, и вывести на экран.
		 */
		int x = 3;
		int y = 4;
		int[][] mas = new int[x][y];

		for (int i = 0; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 0;

			}
		}
		for (int z : mas[0]) {
			mas[0][y - 1] = 1;
			mas[1][y - 2] = 1;
			mas[2][y - 3] = 1;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
