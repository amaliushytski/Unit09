package t.lhu.unit09.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		/**
		 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		 * элементов.
		 */
		int[][] mas = new int[][] { { 1, -2, -3 }, { 11, 22, -33 }, { 53, 66, -17 } };
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("------------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					if (mas[i][j] % 2 != 0) {
						sum = sum + Math.abs(mas[i][j]);
					}
				}
			}
		}
		System.out.println(sum);
	}

}
