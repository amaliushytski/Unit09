package t.lhu.unit09.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		/**
		 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
		 * [0, 9].
		 */
		int[][] mas = new int[2][3];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
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
