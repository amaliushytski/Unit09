package t.lhu.unit09.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		/**
		 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
		 * строка справа налево, вторая строка слева направо, третья строка справа
		 * налево и так далее.
		 */
		int m = 10;
		int x = 7;
		int[][] mas = new int[m][x];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
				if (rand.nextInt(100) % 3 == 0) {
					mas[i][j] = -mas[i][j];
				}
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

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					System.out.printf("%3d ", mas[i][j]);
				}
				System.out.println();
			} else {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("%3d ", mas[i][j]);
				}
				System.out.println();
			}
		}
	}

}
