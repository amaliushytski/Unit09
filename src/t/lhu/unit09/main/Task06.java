package t.lhu.unit09.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		/**
		 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
		 * больше последнего.
		 */
		int[][] mas = new int[5][5];

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

		System.out.println("------------------------");
		for (int j = 0; j < mas.length; j++) {
			if (j % 2 == 0) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					for (int k = 0; k < mas.length; k++) {
						System.out.printf("[%4d]\n", mas[k][j]);
					}
					System.out.println();
				}
			}
		}

	}

}
