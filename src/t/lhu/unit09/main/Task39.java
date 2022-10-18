package t.lhu.unit09.main;

import java.util.Random;

public class Task39 {

	public static void main(String[] args) {
		/**
		 * Найдите произведение двух матриц.
		 */
		int m = 10;
		int mult = 0;
		int[][] mas1 = new int[m][m];

		int[][] mas2 = new int[m][m];

		Random rand = new Random();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%3d ", mas1[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("%3d ", mas2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("------------------------");

		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				for (int k = 0; k < mas2.length; k++) {
					for (int p = 0; p < mas2[i].length; p++) {
						mult = mult + mas1[i][j] * mas2[k][p];
					}
				}
			}
		}
		System.out.println("Произведение двух матриц равно: \n" + mult);
	}

}
